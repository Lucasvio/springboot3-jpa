package com.lucashv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucashv.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
