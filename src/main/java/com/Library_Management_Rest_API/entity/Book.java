package com.Library_Management_Rest_API.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Book")
public class Book extends BaseEntity {

    @Column
    private String title;
    @Column
    private String author;
    @Column
    private String isbn;
    @Column
    private String publisher;
    @Column
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
