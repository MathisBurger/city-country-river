package de.mathisburger.ccr.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
class GameOwner(
    @OneToOne(targetEntity = Game::class)
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    var game: Game? = null,

    @OneToOne(targetEntity = Session::class)
    @JoinColumn(name = "session_id", referencedColumnName = "id")
    @JsonIgnore
    var owner: Session? = null
): BaseEntity()