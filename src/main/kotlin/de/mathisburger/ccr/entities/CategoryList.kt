package de.mathisburger.ccr.entities

import javax.persistence.*

@Entity
class CategoryList(
    @Column(nullable = true)
    var name: String? = null,
    @Column
    var categories: List<String> = ArrayList<String>(),

    @OneToMany(targetEntity = Game::class, mappedBy = "categoryList")
    var games: MutableList<Game> = mutableListOf()
): BaseEntity();