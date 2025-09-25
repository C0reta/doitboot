package com.example.doitboot;

import lombok.*;

@Getter
@Setter
public class Book {
    private String title;
    private String author;

    public static void main(String[] args) {
        Book book = new Book();

    }
}
