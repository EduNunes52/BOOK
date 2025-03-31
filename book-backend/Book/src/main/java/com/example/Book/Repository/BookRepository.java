package com.example.Book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Book.Model.Book;

public interface  BookRepository extends JpaRepository<Book, Long>{
    
}
