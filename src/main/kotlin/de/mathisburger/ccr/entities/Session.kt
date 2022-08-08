package de.mathisburger.ccr.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("SESSIONS")
data class Session(@Id val id: String?, val ip: String?);
