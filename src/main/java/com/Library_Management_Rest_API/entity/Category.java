package com.Library_Management_Rest_API.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Category")
public class Category extends BaseEntity {
    @Column
    private String name;

    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
