package com.example.demo.services;

import com.example.demo.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    private List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        return StreamSupport.stream(bookRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Book getBook(Integer id) {
        return this.books.stream().filter(book -> book.getBookId().equals(id)).findFirst().get();
    }

    public void addBook(Book book) {
        Book newBook = new Book();
        newBook.setBookId(book.getBookId());
        newBook.setDescription(book.getDescription());
        newBook.setIsbn(book.getIsbn());
        newBook.setPublisher(book.getPublisher());
        newBook.setTitle(book.getTitle());

        bookRepository.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
