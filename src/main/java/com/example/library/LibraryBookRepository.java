package com.example.library;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryBookRepository extends JpaRepository<LibraryBook, Long> {
    List<LibraryBook> findByTitleContaining(String title);
    List<LibraryBook> findByAuthorContaining(String author);
}