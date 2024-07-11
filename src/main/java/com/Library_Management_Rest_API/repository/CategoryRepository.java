package com.Library_Management_Rest_API.repository;

import com.Library_Management_Rest_API.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    //findByName
    //findByNameContaining
}
