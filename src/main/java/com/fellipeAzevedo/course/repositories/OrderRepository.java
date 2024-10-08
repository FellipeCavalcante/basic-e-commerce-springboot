package com.fellipeAzevedo.course.repositories;

import com.fellipeAzevedo.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
