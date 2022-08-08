package de.mathisburger.ccr.security

import de.mathisburger.ccr.entities.Session

interface SecurityVoterInterface {
    fun supports(obj: Any): Boolean
    fun checkAccess(attribute: String, obj: Any, session: Session?): Boolean
}