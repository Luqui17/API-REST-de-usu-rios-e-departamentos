package com.devsuperior.udserdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.udserdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
