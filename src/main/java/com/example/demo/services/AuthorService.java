package com.example.demo.services;

import com.example.demo.entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.AuthorRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    private List<Author> authors = new ArrayList<>();

    public List<Author> getAllAuthors() {
        List<Author> tempAuthors = new ArrayList<>();
        this.authorRepository.findAll().forEach(tempAuthors::add);
        return tempAuthors;
    }

    public Author getAuthor(Integer id) {
        return this.authors.stream().filter(author -> author.getAuthorId().equals(id)).findFirst().get();
    }

    public String getFirstName(Integer id) {
        return this.authors.stream().filter(author -> author.getAuthorId().equals(id)).findFirst().get().getFirstName();
    }

    public String getLastName(Integer id) {
        return this.authors.stream().filter(author -> author.getAuthorId().equals(id)).findFirst().get().getLastName();
    }

    public void addAuthor(Author author) {
        this.authorRepository.save(author);
    }

    public void deleteAuthor(Integer id) {
        this.authorRepository.deleteById(id);
    }
}
