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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "EMPLOYEES")
@PrimaryKeyJoinColumn(name = "USER_ID)")
public class Employee extends User{

    @Column(name = "POSITION")
    private String position;

}
