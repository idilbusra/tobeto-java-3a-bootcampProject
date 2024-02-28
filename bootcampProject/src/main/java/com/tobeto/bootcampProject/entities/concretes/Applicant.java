package com.tobeto.bootcampproject.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "APPLICANT")
//@PrimaryKeyJoinColumn(name = "USER_ID")

public class Applicant extends User{

    @Column(name = "ABOUT")
    private String about;
}
