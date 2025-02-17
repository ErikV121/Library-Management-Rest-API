package com.Library_Management_Rest_API.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Book")
public class Book extends BaseEntity {

    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "isbn",nullable = false, unique = true)
    private String isbn;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "available", nullable = false)
    private boolean available;

    public Book(){

    }

    public Book(String title, String author, String isbn, String publisher,boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
