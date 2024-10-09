package com.fellipeAzevedo.course.repositories;

import com.fellipeAzevedo.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
