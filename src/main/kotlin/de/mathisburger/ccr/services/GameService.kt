package de.mathisburger.ccr.services

import de.mathisburger.ccr.entities.Game
import de.mathisburger.ccr.repository.GameRepository
import de.mathisburger.ccr.security.AccessSecurity
import org.springframework.stereotype.Service

@Service
class GameService(val db: GameRepository, val security: AccessSecurity) {

    fun createGame(name: String): Game? {
        var game = Game(name, owner = security.getCurrentSession());
        if (security.isGranted("CREATE", game)) {
            db.save(game);
            return game;
        }
        return null;
    }
}