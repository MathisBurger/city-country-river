package de.mathisburger.ccr.repository

import de.mathisburger.ccr.entities.Session
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface SessionRepository : CrudRepository<Session, Long> {
}