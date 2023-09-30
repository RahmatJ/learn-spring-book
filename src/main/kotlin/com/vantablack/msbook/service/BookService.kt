package com.vantablack.msbook.service

import com.vantablack.msbook.controller.BookResponse
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class BookService(val db: JdbcTemplate) {

    fun getBooks(): List<BookResponse> {
        return db.query("SELECT * FROM books") { response, _ ->
            BookResponse(
                id = response.getString("id"),
                title = response.getString("title"),
                writer = response.getString("writer"),
                publishedYear = response.getInt("publishedYear")
            )
        }
    }
}