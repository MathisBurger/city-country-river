package de.mathisburger.ccr.security

import de.mathisburger.ccr.entities.Game
import de.mathisburger.ccr.entities.Session

class GameVoter: SecurityVoterInterface {

    override fun supports(obj: Any): Boolean {
        return obj is Game;
    }

    override fun checkAccess(attribute: String, obj: Any, session: Session?): Boolean {
        return when (attribute) {
            "CREATE" -> session != null
            else -> false
        };
    }
}