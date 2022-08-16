package de.mathisburger.ccr.repository

import de.mathisburger.ccr.entities.Player
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PlayerRepository : CrudRepository<Player, Long> {
}