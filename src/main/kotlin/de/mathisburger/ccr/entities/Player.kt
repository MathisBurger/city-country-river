package de.mathisburger.ccr.entities

import javax.persistence.*

@Entity
class Player(
    @Column(nullable = false)
    var name: String? = null,

    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL],mappedBy = "playerProfile")
    @JoinColumn(name= "SESSION")
    var session: Session? = null,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "GAME")
    var game: Game? = null
) : BaseEntity()