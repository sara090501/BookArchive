package com.example.demo.services;

import com.example.demo.entities.Book;
import com.example.demo.entities.System;
import com.example.demo.repositories.AuthorRepository;
import com.example.demo.repositories.BookRepository;
import com.example.demo.repositories.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SystemService {
    @Autowired
    private SystemRepository systemRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;

    private List<System> systems = new ArrayList<>();

    public List<System> getAllRecords() {
        return StreamSupport.stream(systemRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public System getRecord(Integer record) {
        return this.systems.stream().filter(systems -> systems.getColumn().equals(record)).findFirst().get();
    }

    public void addRecord(System system) {
        systemRepository.save(system);
    }

    public void deleteBook(Integer record) {
        systemRepository.deleteById(record);
    }
}
