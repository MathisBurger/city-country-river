package de.mathisburger.ccr.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.OneToOne

@Entity
class Session(
    @Column(nullable = true)
    val ip: String?=null,

    @ManyToOne(targetEntity = Game::class)
    val currentGame: Game? = null,

    @OneToOne(targetEntity = Game::class, mappedBy = "owner")
    val owningGame: Game? = null
): BaseEntity() {
}
