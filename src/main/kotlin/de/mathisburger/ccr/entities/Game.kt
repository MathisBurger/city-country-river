package de.mathisburger.ccr.entities

import javax.persistence.*

@Entity
class Game(
    @Column(nullable = true)
    var name: String?=null,

    @OneToMany(targetEntity = Session::class)
    var player: MutableList<Session> = mutableListOf(),

    @OneToOne(targetEntity = GameOwner::class, mappedBy = "owner")
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    var owner: GameOwner? = null,

    @ManyToOne(targetEntity = CategoryList::class)
    var categoryList: CategoryList? = null
): BaseEntity();