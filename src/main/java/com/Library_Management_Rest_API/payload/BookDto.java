package com.Library_Management_Rest_API.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//response & request DTO for books
public class BookDto {

    @Size(min = 1, message = "title should have atleast 1 character")
    private String title;
    @NotBlank(message = "author can not be blank")
    private String author;
    @NotBlank(message = "publisher can not be blank")
    private String publisher;
    @Size(max = 13, message = "isbn can not be more than 13 characters ")
    private String isbn;
    private boolean available;

    public BookDto(){

    }

    public BookDto(String title, String author, String publisher, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
