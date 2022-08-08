package de.mathisburger.ccr.services

import de.mathisburger.ccr.entities.Session
import de.mathisburger.ccr.repository.SessionRepository
import org.springframework.stereotype.Service

@Service
class SessionService(val db: SessionRepository) {

    /**
     * Creates a new session
     */
    fun createSession(ip: String): Session? {
        val session = Session(ip);
        db.save(session);
        return db.findSessionByIp(ip);
    }
}