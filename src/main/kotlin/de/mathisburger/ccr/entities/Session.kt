package de.mathisburger.ccr.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.*
import javax.persistence.*

@Entity
class Session(
    @Column(nullable = true)
    var ip: String?=null,

    @Column(nullable = false)
    @JsonIgnore
    var sessionSecret: String? = UUID.randomUUID().toString(),

    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "GAME")
    var ownedGame: Game? = null
): BaseEntity() {

}
