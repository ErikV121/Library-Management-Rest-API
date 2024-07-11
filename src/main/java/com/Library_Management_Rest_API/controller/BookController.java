package com.Library_Management_Rest_API.controller;

import com.Library_Management_Rest_API.entity.Book;
import com.Library_Management_Rest_API.payload.BookDto;
import com.Library_Management_Rest_API.service.BookService;
import com.Library_Management_Rest_API.service.impl.BookServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lib")
public class BookController {

    private final BookServiceImpl bookServiceimpl;

    public BookController(BookServiceImpl bookServiceimpl) {
        this.bookServiceimpl = bookServiceimpl;
    }

    @PostMapping
    public ResponseEntity<BookDto> addBook(@RequestBody BookDto bookdto) {
        return new ResponseEntity<>(bookServiceimpl.createBook(bookdto), HttpStatus.CREATED);
    }
    //TODO: Implement request methods
}
