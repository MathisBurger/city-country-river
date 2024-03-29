package de.mathisburger.ccr.entities

import javax.persistence.*

@Entity
class Game(
    @Column(nullable = false)
    var name: String? = null,

    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL],mappedBy = "ownedGame")
    @JoinColumn(name = "SESSION")
    var owningSession: Session? = null,

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL],mappedBy = "game")
    var player: MutableList<Player> = mutableListOf()
): BaseEntity()