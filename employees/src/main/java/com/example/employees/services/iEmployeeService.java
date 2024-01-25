package com.example.employees.services;

import com.example.employees.dto.employeeDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface iEmployeeService {
    employeeDTO addEmployee(employeeDTO employeeDTO);
    employeeDTO findById(long id);
    List<employeeDTO> findAll();

    employeeDTO updateEmployee(employeeDTO article);

    void deleteEmployee(long id);
}
