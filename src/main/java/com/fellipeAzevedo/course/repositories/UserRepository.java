package com.fellipeAzevedo.course.repositories;

import com.fellipeAzevedo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
