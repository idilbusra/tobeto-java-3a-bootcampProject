package com.tobeto.bootcampproject.entities.concretes;

import com.tobeto.bootcampproject.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS")
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends BaseEntity<Integer> {

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "DATE_OF_BIRTH")
    private LocalDateTime dateOfBirth;

    @Column(name = "NATIONAL_IDENTITY")
    private String nationalIdentity;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;


}
