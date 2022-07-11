package com.example.demo.controllers;

import com.example.demo.entities.Author;
import com.example.demo.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping(value = "/authors")
    public List<Author> getAllAuthors() {
        return this.authorService.getAllAuthors();
    }

    @PostMapping(value = "/authors/add")
    public void addAuthor(@RequestBody Author author) {
        this.authorService.addAuthor(author);
    }

    @PutMapping(value = "/authors/{id}")
    public void updateAuthor(@RequestBody Author author, @PathVariable Integer id) {
        this.authorService.addAuthor(author);
    }

    @DeleteMapping(value = "/authors/{id}")
    public void deleteAuthor(@PathVariable Integer id) {
        this.authorService.deleteAuthor(id);
    }
}
