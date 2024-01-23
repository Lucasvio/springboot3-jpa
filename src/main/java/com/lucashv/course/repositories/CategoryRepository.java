package com.lucashv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucashv.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
