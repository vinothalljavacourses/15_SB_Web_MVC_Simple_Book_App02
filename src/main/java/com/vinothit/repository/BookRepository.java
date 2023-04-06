package com.vinothit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinothit.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
