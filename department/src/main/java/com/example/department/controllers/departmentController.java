package com.example.department.controllers;

import com.example.department.dto.departmentDTO;
import com.example.department.services.IDepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("department")
public class departmentController {

    private final IDepartmentService deptService;

@PostMapping("add")
departmentDTO addDept(@RequestBody departmentDTO departmentDTO){

    return deptService.add(departmentDTO);
    }


@GetMapping("findAll")
public List<departmentDTO> getAllEmployees() {
        return deptService.findAll();
    }

@GetMapping("findOne/{id}")
departmentDTO findById(@PathVariable long id){
        return deptService.findById(id);
    }

@PutMapping("update")
departmentDTO update(@RequestBody departmentDTO employeeDTO){
        return deptService.update(employeeDTO);
    }

@DeleteMapping("deleteOne/{id}")
void  deleteArticleById(@PathVariable long id){

        deptService.delete(id);
    }
}
