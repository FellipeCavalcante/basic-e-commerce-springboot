package com.fellipeAzevedo.course.repositories;

import com.fellipeAzevedo.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
