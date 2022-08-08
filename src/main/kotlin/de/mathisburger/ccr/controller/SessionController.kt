package de.mathisburger.ccr.controller

import de.mathisburger.ccr.entities.Session
import de.mathisburger.ccr.services.SessionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest


@RestController
class SessionController(val service: SessionService) {

    @Autowired
    private lateinit var request: HttpServletRequest;

    /**
     * Creates a new session that can be used
     */
    @GetMapping("/session/create")
    fun createSession(): Session? {
        var session = service.createSession(request.remoteAddr);
        return session;
    }
}