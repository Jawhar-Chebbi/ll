package com.example.department.repositories;

import com.example.department.entities.department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface departmentRepo extends MongoRepository<department,Long> {
}
