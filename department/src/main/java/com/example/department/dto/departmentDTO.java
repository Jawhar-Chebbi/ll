package com.example.department.dto;

import com.example.department.entities.department;
import lombok.Builder;

@Builder
public record departmentDTO(long id, String name) {
    public static department mapToEntity(departmentDTO departmentDTO){
        return department.builder()
                .id(departmentDTO.id)
                .name(departmentDTO.name)
                .build();
    }

    public static departmentDTO mapToDTO(department department){
        return departmentDTO.builder()
                .id(department.getId())
                .name(department.getName())
                .build();

    }


}
