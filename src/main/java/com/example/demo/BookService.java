package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    private List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        //return this.books;
        List books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public Book getBook(Integer id) {
        return this.books.stream().filter(book -> book.getId().equals(id)).findFirst().get();
    }

    public void addBook(Book book) {
        //this.books.add(book);
        bookRepository.save(book);
    }

    public void updateBook(Integer id, Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (book.getId().equals(id)) {
                books.set(i, book);
            }
        }
    }

    public void deleteBook(Integer id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}
