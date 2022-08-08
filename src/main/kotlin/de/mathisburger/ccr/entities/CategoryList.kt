package de.mathisburger.ccr.entities

import javax.persistence.*

@Entity
class CategoryList(
    @ElementCollection
    @Column(name = "words")
    val categories: MutableList<String> = mutableListOf(),

    @OneToMany(targetEntity = Game::class, mappedBy = "categoryList")
    val games: MutableList<Game> = mutableListOf()
): BaseEntity();