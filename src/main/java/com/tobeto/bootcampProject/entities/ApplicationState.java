package com.tobeto.bootcampProject.entities;

import com.tobeto.bootcampProject.core.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="application_states")
public class ApplicationState extends BaseEntity <Integer> {
    @Column(name = "name")
    private String name;
}