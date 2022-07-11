//package com.example.demo.entities;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//public class Record {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer row;
//
//    @ManyToOne
//    @JoinColumn(name = "author_id")
//    private Author author;
//
//    @ManyToOne
//    @JoinColumn(name = "book_id")
//    private Book book;
//}
