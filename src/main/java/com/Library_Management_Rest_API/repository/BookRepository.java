package com.Library_Management_Rest_API.repository;

import com.Library_Management_Rest_API.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;


public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByIsbn(String isbn);
    List<Book> findByAuthorIgnoreCase(String author);
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByAvailable (boolean isAvailable);
}
