package de.mathisburger.ccr.security

import de.mathisburger.ccr.entities.Session
import de.mathisburger.ccr.repository.SessionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import javax.servlet.http.HttpServletRequest




@Service
class AccessSecurity {

    @Autowired
    lateinit var request: HttpServletRequest;

    @Autowired
    lateinit var sessionRepository: SessionRepository;

    var voters: List<SecurityVoterInterface> = listOf(
    );

    fun getCurrentSession(): Session? {
        val id = findCookie("SESSION_ID") ?: return null;
        val session =  sessionRepository.findById(id.toLong());
        if (!session.isEmpty && session.get().sessionSecret.equals(findCookie("SESSION_SECRET"))) {
            return session.get();
        }
        return null;
    }

    fun isGranted(attribute: String, obj: Any): Boolean {

        val session = getCurrentSession();

        for (voter in voters) {
            if (voter.supports(obj)) {
                return voter.checkAccess(attribute, obj, session);
            }
        }
        return false;
    }

    private fun findCookie(name: String): String? {
        for (cookie in request.cookies) {
            if (cookie.name.equals(name)) {
                return cookie.value;
            }
        }
        return null;
    }
}