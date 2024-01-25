package com.example.department.services;

import com.example.department.dto.departmentDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IDepartmentService {

    departmentDTO add(departmentDTO departmentDTO);
    departmentDTO findById(long id);
    List<departmentDTO> findAll();
    departmentDTO update(departmentDTO stockDTO);
    void delete(long id);



}
