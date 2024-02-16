package com.tobeto.bootcampProject.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class Employee {
    import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

    @Entity
    @Getter
    @Setter
    @RequiredArgsConstructor
    @AllArgsConstructor
    public class Employee extends User {

        private String position;
    }
}
