package com.LibraryManagementSystem.Repository;

import com.LibraryManagementSystem.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {

    Book findByBookName(String bookName);

    Book findByAuthorName(String authorName);

   // Book findByPublishedDate(LocalDate PublishedDate);
}
