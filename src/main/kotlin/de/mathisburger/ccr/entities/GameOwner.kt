package de.mathisburger.ccr.entities

import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
class GameOwner(
    @OneToOne(targetEntity = Game::class)
    var game: Game? = null,

    @OneToOne(targetEntity = Session::class)
    var owner: Session? = null
): BaseEntity()