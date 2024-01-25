package com.example.employees.repositories;

import com.example.employees.entities.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepo extends JpaRepository<employee,Long> {
}
