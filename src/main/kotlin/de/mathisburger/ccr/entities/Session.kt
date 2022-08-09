package de.mathisburger.ccr.entities

import java.util.*
import javax.persistence.*

@Entity
class Session(
    @Column(nullable = true)
    val ip: String?=null,

    @ManyToOne(targetEntity = Game::class)
    val currentGame: Game? = null,

    @OneToOne(targetEntity = Game::class, mappedBy = "owner")
    val owningGame: Game? = null,

    @Column(nullable = false)
    val sessionSecret: String? = UUID.randomUUID().toString(),
): BaseEntity() {

}
