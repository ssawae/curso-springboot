package com.aprendendojava.curso.repositories;

import com.aprendendojava.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
