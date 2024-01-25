package com.example.department.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class department implements Serializable {

    @Id
    long id;
    String name;
}
