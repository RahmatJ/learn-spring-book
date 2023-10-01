package com.vantablack.msbook.controller

import com.vantablack.msbook.service.BookService
import org.springframework.web.bind.annotation.*

@RestController
class BookController(val service: BookService) {

    @GetMapping("/books")
    fun getBooks(): List<BookResponse> {
        return service.getBooks()
    }

    @GetMapping("/books/{id}")
    fun getBookById(@PathVariable id: String): List<BookResponse> {
        return service.getBookById(id)
    }

    @PostMapping("/books")
    fun createBooks(@RequestBody book: BookResponse) {
        service.save(book)
    }
}

data class BookResponse(val id: String?, val title: String, val writer: String, val publishedYear: Int)