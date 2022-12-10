package com.coursejpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejpa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
