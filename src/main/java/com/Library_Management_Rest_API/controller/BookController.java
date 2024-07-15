package com.Library_Management_Rest_API.controller;

import com.Library_Management_Rest_API.payload.BookDto;
import com.Library_Management_Rest_API.service.impl.BookServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/library/")
public class BookController {

    private final BookServiceImpl bookServiceimpl;

    public BookController(BookServiceImpl bookServiceimpl) {
        this.bookServiceimpl = bookServiceimpl;
    }
    @PostMapping
    public ResponseEntity<BookDto> addBook(@RequestBody BookDto bookdto) {
        return new ResponseEntity<>(bookServiceimpl.createBook(bookdto), HttpStatus.CREATED);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable(name = "id") long id) {
        System.out.println("id");
        return new ResponseEntity<>(bookServiceimpl.getBookById(id), HttpStatus.OK);
    }

    @GetMapping("/isbn/{isbn}")
    public ResponseEntity<BookDto> getBookByIsbn(@PathVariable String isbn) {
        System.out.println("isbn");
        return new ResponseEntity<>(bookServiceimpl.getBookByIsbn(isbn), HttpStatus.OK);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<BookDto>> getListOfBooks(@PathVariable String title) {
        return new ResponseEntity<>(bookServiceimpl.getBooksByTitle(title), HttpStatus.OK);

    }

}
