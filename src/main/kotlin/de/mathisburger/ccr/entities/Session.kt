package de.mathisburger.ccr.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.*
import javax.persistence.*

@Entity
class Session(
    @Column(nullable = true)
    var ip: String?=null,

    @ManyToOne(targetEntity = Game::class, optional = true)
    @JoinColumn(name = "game_id")
    @JsonIgnore
    var currentGame: Game? = null,

    @OneToOne(targetEntity = GameOwner::class, mappedBy = "owner", optional = true)
    @JoinColumn(name = "owner_id")
    var gameOwner: GameOwner? = null,

    @Column(nullable = false)
    @JsonIgnore
    var sessionSecret: String? = UUID.randomUUID().toString(),
): BaseEntity() {

}
