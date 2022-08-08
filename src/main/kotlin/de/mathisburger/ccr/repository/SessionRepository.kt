package de.mathisburger.ccr.repository

import de.mathisburger.ccr.entities.Session
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface SessionRepository : CrudRepository<Session, String> {

    fun findSessionById(id: String): Session?
    fun findSessionByIp(ip: String): Session?
}