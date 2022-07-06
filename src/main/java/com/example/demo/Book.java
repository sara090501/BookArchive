package com.example.demo;

import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(name = "uk_book_isbn", columnNames = "isbn") })
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String isbn;
    @NotBlank
    private String title;

    private String description;
    @ElementCollection
    @NotEmpty
    private Set<Author> authors;
    @NotBlank
    private String publisher;

    //standard constructor
    public Book() {
    }

    //structured constructor
    public Book(String isbn, String title, Set<Author> authors, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
    }

    //copy constructor
    public Book(String isbn, String title, String publisher) {
        this(isbn, title, new HashSet<>(), publisher);
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("id", this.id)
                .append("isbn", this.isbn)
                .append("title", this.title)
                .append("description", this.description)
                .append("authors", this.authors)
                .append("publisher", this.publisher)
                .toString();
    }
}
