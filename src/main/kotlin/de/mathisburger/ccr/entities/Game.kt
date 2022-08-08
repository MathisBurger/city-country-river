package de.mathisburger.ccr.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.OneToOne

@Entity
class Game(
    @Column(nullable = true)
    val name: String?=null,

    @OneToMany(targetEntity = Session::class, mappedBy = "currentGame")
    val player: MutableList<Session> = mutableListOf(),

    @OneToOne(targetEntity = Session::class, mappedBy = "owningGame")
    val owner: Session? = null,

    @ManyToOne(targetEntity = CategoryList::class)
    val categoryList: CategoryList? = null
): BaseEntity()