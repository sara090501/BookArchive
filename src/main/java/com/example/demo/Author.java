package com.example.demo;

import javax.persistence.Embeddable;

@Embeddable
public class Author {
    private String firstName;
    private String lastName;

    public Author() {
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
}
