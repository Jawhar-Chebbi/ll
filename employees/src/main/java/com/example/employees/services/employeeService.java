package com.example.employees.services;

import com.example.employees.dto.employeeDTO;
import com.example.employees.entities.employee;
import com.example.employees.repositories.employeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class employeeService implements iEmployeeService{
private final employeeRepo repo;


    @Override
    public employeeDTO addEmployee(employeeDTO employeeDTO) {
        employee emp=repo.save(employeeDTO.mapToEntity(employeeDTO));
        return employeeDTO.mapToDTO(emp);
    }

    @Override
    public employeeDTO findById(long id) {
        employee emp=repo.findById(id).orElseThrow(()->new IllegalArgumentException("Not found"));
        return employeeDTO.mapToDTO(emp) ;
    }

    @Override
    public List<employeeDTO> findAll() {
        List<employee> emps = repo.findAll();
        return emps.stream()
                .map(employeeDTO::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public employeeDTO updateEmployee(employeeDTO employeeDTO) {
        employee emp=repo.save(employeeDTO.mapToEntity(employeeDTO));

        return employeeDTO.mapToDTO(emp);
    }

    @Override
    public void deleteEmployee(long id) {
        repo.deleteById(id);

    }
}
