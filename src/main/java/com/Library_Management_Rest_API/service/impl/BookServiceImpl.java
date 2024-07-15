package com.Library_Management_Rest_API.service.impl;

import com.Library_Management_Rest_API.entity.Book;
import com.Library_Management_Rest_API.exception.ResourceAlreadyExistsException;
import com.Library_Management_Rest_API.exception.ResourceNotFoundException;
import com.Library_Management_Rest_API.payload.BookDto;
import com.Library_Management_Rest_API.repository.BookRepository;
import com.Library_Management_Rest_API.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

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
        if(bookRepository.findByIsbn(bookDto.getIsbn()).isPresent()){
            throw new ResourceAlreadyExistsException("Book","id", bookDto.getIsbn());
        }

        return maptoBookDto(bookRepository.save(maptoBook(bookDto)));
    }
    @Override
    public BookDto getBookById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book","id",id));
        return maptoBookDto(book);
    }

    @Override
    public BookDto getBookByIsbn(String isbn) {
        Book book = bookRepository.findByIsbn(isbn).orElseThrow(() -> new ResourceNotFoundException("Book","isbn",isbn));
        return maptoBookDto(book);
    }

    @Override
    public List<BookDto> getBooksByTitle(String title) {
        List<Book> books = bookRepository.findByTitleContainingIgnoreCase(title);
        return books.stream()
                .map(this::maptoBookDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookDto updateBook(Long id, BookDto bookDto) {
        return null;
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    //model mapper
    public Book maptoBook(BookDto bookDto) {
        return modelMapper.map(bookDto, Book.class);
    }

    public BookDto maptoBookDto(Book book) {
        return modelMapper.map(book, BookDto.class);
    }
}
