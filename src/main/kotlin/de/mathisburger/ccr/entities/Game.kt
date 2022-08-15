package de.mathisburger.ccr.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.OneToOne

@Entity
class Game(
    @Column(nullable = true)
    var name: String?=null,

    @OneToMany(targetEntity = Session::class, mappedBy = "currentGame")
    var player: MutableList<Session> = mutableListOf(),

    @OneToOne(targetEntity = GameOwner::class, mappedBy = "game")
    @JoinColumn(name = "owner_id")
    var owner: GameOwner? = null,

    @ManyToOne(targetEntity = CategoryList::class)
    var categoryList: CategoryList? = null
): BaseEntity();