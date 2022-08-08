package de.mathisburger.ccr.entities

import java.util.*
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID = UUID.randomUUID()
) {

    override fun equals(other: Any?): Boolean {
        other ?: return false

        if (this === other) return true

        if (this::class != other::class) return false

        other as BaseEntity
        return this.id == other.id
    }

    override fun hashCode(): Int {
        return this.id.hashCode()
    }
}