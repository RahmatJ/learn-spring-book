package com.vantablack.msbook.service

import com.vantablack.msbook.controller.BookResponse
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class BookService(val db: JdbcTemplate) {

    fun getBooks(): List<BookResponse> {
        return listOf(BookResponse("1", "Detective Conan", "Aoyama Gosho", 1994))
    }

    fun getBookById(id: String): List<BookResponse> {
        return listOf(BookResponse(id, "Detective Conan", "Aoyama Gosho", 1994))
    }

    fun save(book: BookResponse) {
        println(book)
    }
}