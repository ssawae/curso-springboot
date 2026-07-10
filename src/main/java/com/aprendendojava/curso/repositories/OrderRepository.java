package com.aprendendojava.curso.repositories;

import com.aprendendojava.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
