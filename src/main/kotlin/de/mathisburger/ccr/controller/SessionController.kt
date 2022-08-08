package de.mathisburger.ccr.controller

import de.mathisburger.ccr.entities.Session
import de.mathisburger.ccr.services.SessionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.Cookie
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


@RestController
class SessionController(val service: SessionService) {

    @Autowired
    private lateinit var request: HttpServletRequest;

    /**
     * Creates a new session that can be used
     */
    @GetMapping("/session/create")
    fun createSession(response: HttpServletResponse): String? {
        val session = service.createSession(request.remoteAddr);
        if (session == null) {
            response.status = 400;
            return "Error while creating session";
        }
        val sessionIdCookie = Cookie("SESSION_ID", session.id.toString());
        val sessionSecretCookie = Cookie("SESSION_SECRET", session.sessionSecret);
        response.addCookie(sessionIdCookie);
        response.addCookie(sessionSecretCookie);
        return "Session successfully created";
    }
}