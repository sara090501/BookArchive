package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    @NotBlank
    private String isbn;
    @NotBlank
    private String title;

    private String description;

    @NotBlank
    private String publisher;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book")
    private List<Author> authorList = new ArrayList<>();
}
