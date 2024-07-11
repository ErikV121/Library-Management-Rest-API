package com.Library_Management_Rest_API.service.impl;

import com.Library_Management_Rest_API.entity.Book;
import com.Library_Management_Rest_API.payload.BookDto;
import com.Library_Management_Rest_API.repository.BookRepository;
import com.Library_Management_Rest_API.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    public BookServiceImpl(BookRepository bookRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public BookDto createBook(BookDto bookDto) {
//        Book book = maptoBook(bookDto);
//        Book savedBook = bookRepository.save(book);
//        return maptoBookDto(savedBook);
        return maptoBookDto(bookRepository.save(maptoBook(bookDto)));
    }
    //TODO: impelement business logic for get,update and delete
    @Override
    public BookDto getBookById(long id) {
        return null;
    }

    @Override
    public BookDto getBookByIsbn(String isbn) {
        return null;
    }

    @Override
    public List<BookDto> getAllBooks() {
        return List.of();
    }

    @Override
    public BookDto updateBook(BookDto bookDto) {
        return null;
    }

    @Override
    public void deleteBookById(long id) {

    }

    //model mapper
    public Book maptoBook(BookDto bookDto) {
        return modelMapper.map(bookDto, Book.class);
    }

    public BookDto maptoBookDto(Book book) {
        return modelMapper.map(book, BookDto.class);
    }
}
