package de.mathisburger.ccr.entities

import org.springframework.data.annotation.Id as SpringId
import java.util.*
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity(
    @SpringId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
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