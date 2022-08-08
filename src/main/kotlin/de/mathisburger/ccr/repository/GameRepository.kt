package de.mathisburger.ccr.repository

import de.mathisburger.ccr.entities.Game
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface GameRepository: CrudRepository<Game, UUID> {

    fun findGameById(id: UUID): Game?
}