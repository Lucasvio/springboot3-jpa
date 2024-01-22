package com.lucashv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucashv.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
