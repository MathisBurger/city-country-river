package de.mathisburger.ccr.repository

import de.mathisburger.ccr.entities.Game
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository : CrudRepository<Game, Long> {
}