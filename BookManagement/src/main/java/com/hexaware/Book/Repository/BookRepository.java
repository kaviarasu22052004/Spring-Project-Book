package com.hexaware.Book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.Book.Entity.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}
