package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorService {
    private ArrayList<Author> authors = new ArrayList<>();

    public Author getAuthor(Integer id) {
        return this.authors.stream().filter(author -> author.getId().equals(id)).findFirst().get();
    }

    public String getFirstName(Integer id) {
        return this.authors.stream().filter(author -> author.getId().equals(id)).findFirst().get().getFirstName();
    }

    public String getLastName(Integer id) {
        return this.authors.stream().filter(author -> author.getId().equals(id)).findFirst().get().getLastName();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void deleteAuthor(Integer id) {
        this.authors.removeIf(author -> author.getId().equals(id));
    }
}
