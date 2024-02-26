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
@Table(name="bootcamp_states")
public class BootcampState extends BaseEntity<Integer> {
    @Column(name = "name")
    private String name;
}