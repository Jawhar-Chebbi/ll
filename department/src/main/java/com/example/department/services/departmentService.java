package com.example.department.services;

import com.example.department.dto.departmentDTO;
import com.example.department.entities.department;
import com.example.department.repositories.departmentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class departmentService implements IDepartmentService{
    private final departmentRepo repo;

    @Override
    public departmentDTO add(departmentDTO departmentDTO) {
        department dept=repo.save(departmentDTO.mapToEntity(departmentDTO));
        return departmentDTO.mapToDTO(dept);
    }

    @Override
    public departmentDTO findById(long id) {
        department dept=repo.findById(id).orElseThrow(()->new IllegalArgumentException("not found"));
        return departmentDTO.mapToDTO(dept);
    }

    @Override
    public List<departmentDTO> findAll() {
        List<department> depts = repo.findAll();
        return depts.stream()
                .map(departmentDTO::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public departmentDTO update(departmentDTO departmentDTO) {
        department dept=repo.save(departmentDTO.mapToEntity(departmentDTO));

        return departmentDTO.mapToDTO(dept);
    }

    @Override
    public void delete(long id) {
        repo.deleteById(id);
    }
}
