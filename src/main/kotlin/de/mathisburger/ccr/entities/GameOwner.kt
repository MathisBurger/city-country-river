package de.mathisburger.ccr.entities

import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
class GameOwner(
    @OneToOne(targetEntity = Game::class, mappedBy = "owner")
    @JoinColumn(name = "game_id")
    var game: Game? = null,

    @OneToOne(targetEntity = Session::class, mappedBy = "gameOwner")
    @JoinColumn(name = "owner_id")
    var owner: Session? = null
): BaseEntity()