package com.example.employees.controllers;

import com.example.employees.dto.employeeDTO;
import com.example.employees.services.iEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("employee")
public class employeeController {
    private final iEmployeeService employeeService;
@PostMapping("addEmployee")
employeeDTO addEMP(@RequestBody employeeDTO employeeDTO){
        return employeeService.addEmployee(employeeDTO);
    }
@GetMapping("findAll")
public List<employeeDTO> getAllEmployees() {
        return employeeService.findAll();
   }

@GetMapping("findOne/{id}")
employeeDTO findById(@PathVariable long id){
        return employeeService.findById(id);
    }

@PutMapping("update")
employeeDTO update(@RequestBody employeeDTO employeeDTO){
        return employeeService.updateEmployee(employeeDTO);
    }

@DeleteMapping("deleteOne/{id}")
 void  deleteArticleById(@PathVariable long id){

    employeeService.deleteEmployee(id);
    }
}




