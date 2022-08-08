package de.mathisburger.ccr.repository

import de.mathisburger.ccr.entities.CategoryList
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface CategoryListRepository: CrudRepository<CategoryList, UUID> {

    fun findCategoryListsByName(name: String): MutableList<CategoryList>
    fun findCategoryListById(id: UUID): CategoryList?
}