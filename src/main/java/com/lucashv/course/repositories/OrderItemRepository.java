package com.lucashv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucashv.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
