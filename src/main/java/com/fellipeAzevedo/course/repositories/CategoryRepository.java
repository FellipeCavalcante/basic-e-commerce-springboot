package com.fellipeAzevedo.course.repositories;

import com.fellipeAzevedo.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
