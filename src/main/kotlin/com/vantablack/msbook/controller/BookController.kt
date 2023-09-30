package com.vantablack.msbook.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController {

    @GetMapping("/books")
    fun getBooks(): List<BookResponse> {
        val books = listOf<BookResponse>(
            BookResponse("1", "Detective Conan", "Aoyama Gosho", 1994),
            BookResponse("2", "Magic Kaito", "Aoyama Gosho", 1996),
            BookResponse("3", "Animal Farm", "George Orwell", 1945)
        )
        return books
    }
}

data class BookResponse(val id: String, val title: String, val writer: String, val publishedYear: Int)