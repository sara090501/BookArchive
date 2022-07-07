package com.example.demo.controllers;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import com.example.demo.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.BookService;

import java.time.LocalDate;
import java.util.List;

@RequestMapping
@RestController
public class Controller {

    @Autowired
    private BookService bookService;
    private AuthorService authorService;

    @RequestMapping(method = RequestMethod.GET, value = "/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/authors")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books/add")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/authors/add")
    public void addAuthor(@RequestBody Author author) {
        authorService.addAuthor(author);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/book/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable Integer id) {
        bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/authors/{id}")
    public void updateAuthor(@RequestBody Author author, @PathVariable Integer id) {
        authorService.addAuthor(author);
    }
}
