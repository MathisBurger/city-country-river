package de.mathisburger.ccr.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.*
import javax.persistence.*

@Entity
class Session(
    @Column(nullable = true)
    var ip: String?=null,

    @ManyToOne(targetEntity = Game::class, optional = true)
    @JsonIgnore
    @JoinColumn(name = "current_game_id", referencedColumnName = "id")
    var currentGame: Game? = null,

    @OneToOne(targetEntity = GameOwner::class,  optional = true)
    @JoinColumn(name = "game_owner_id", referencedColumnName = "id")
    var gameOwner: GameOwner? = null,

    @Column(nullable = false)
    @JsonIgnore
    var sessionSecret: String? = UUID.randomUUID().toString(),
): BaseEntity() {

}
