package com.example.demo.controllers;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import com.example.demo.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.BookService;

import java.util.List;

@RequestMapping
@RestController
@RequiredArgsConstructor
public class Controller {
    private final BookService bookService;
    private final AuthorService authorService;

    @GetMapping(value = "/books")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @GetMapping(value = "/authors")
    public List<Author> getAllAuthors() {
        return this.authorService.getAllAuthors();
    }

    @PostMapping(value = "/books/add")
    public void addBook(@RequestBody Book book) {
        this.bookService.addBook(book);
    }

    @PostMapping(value = "/authors/add")
    @Transactional
    public void addAuthor(@RequestBody Author author) {
        this.authorService.addAuthor(author);
    }

    @PutMapping(value = "/book/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable Integer id) {
        bookService.addBook(book);
    }

    @PutMapping(value = "/authors/{id}")
    public void updateAuthor(@RequestBody Author author, @PathVariable Integer id) {
        this.authorService.addAuthor(author);
    }

    @DeleteMapping(value = "/books/{id}")
    public void deleteBook(@PathVariable Integer id) {
        this.bookService.deleteBook(id);
    }

    @DeleteMapping(value = "/authors/{id}")
    public void deleteAuthor(@PathVariable Integer id) {
        this.authorService.deleteAuthor(id);
    }
}
