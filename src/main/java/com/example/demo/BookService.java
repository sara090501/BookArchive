package com.example.demo;

import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public Book getBook(Integer id) {
        return this.books.stream().filter(book -> book.getId().equals(id)).findFirst().get();
    }

    public void addBook(Book book) {
        this.books.add(book);
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
