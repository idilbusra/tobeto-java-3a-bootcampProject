package com.tobeto.bootcampProject.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class Instructor {
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
    public class Instructor extends User {

        private String companyName;
}
