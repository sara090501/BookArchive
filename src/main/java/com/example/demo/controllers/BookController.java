package com.example.demo.controllers;

import com.example.demo.entities.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.BookService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping(value = "/books")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @PostMapping(value = "/books/add")
    public void addBook(@RequestBody Book book) {
        this.bookService.addBook(book);
    }

    @PutMapping(value = "/book/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable Integer id) {
        bookService.addBook(book);
    }

    @DeleteMapping(value = "/books/{id}")
    public void deleteBook(@PathVariable Integer id) {
        this.bookService.deleteBook(id);
    }
}
