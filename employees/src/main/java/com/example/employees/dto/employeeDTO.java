package com.example.employees.dto;

import com.example.employees.entities.employee;
import lombok.Builder;
@Builder
public record employeeDTO(long id, String name) {
    public static employee mapToEntity(employeeDTO employeedto) {
        return employee.builder()
                .id(employeedto.id())
                .name(employeedto.name())
                .build();
    }

    public static employeeDTO mapToDTO(employee employee) {
        return employeeDTO.builder()
                .id(employee.getId())
                .name(employee.getName())
                .build();
    }



}
