package com.Library_Management_Rest_API.service;

import com.Library_Management_Rest_API.payload.BookDto;

import java.util.List;

public interface BookService {
    BookDto createBook(BookDto bookDto);
    BookDto getBookById(long id);
    BookDto getBookByIsbn(String isbn);
    List<BookDto> getAllBooks();
    BookDto updateBook(BookDto bookDto);
    void deleteBookById(long id);
}
