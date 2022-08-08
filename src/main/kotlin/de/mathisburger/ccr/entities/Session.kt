package de.mathisburger.ccr.entities

import javax.persistence.Column
import javax.persistence.Entity

@Entity
class Session(
    @Column(nullable = true)
    val ip: String?=null
): BaseEntity() {
}
