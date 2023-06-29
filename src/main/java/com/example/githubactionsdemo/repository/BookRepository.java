package com.example.githubactionsdemo.repository;

import com.example.githubactionsdemo.Book;

public interface BookRepository {
    Book getBookById(int id);
}
