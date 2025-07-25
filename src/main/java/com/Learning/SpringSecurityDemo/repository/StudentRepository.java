package com.Learning.SpringSecurityDemo.repository;

import com.Learning.SpringSecurityDemo.models.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<student, Integer> {

    // This interface will automatically provide CRUD operations for the student entity.
    // No additional methods are needed unless you want to define custom queries.
}
