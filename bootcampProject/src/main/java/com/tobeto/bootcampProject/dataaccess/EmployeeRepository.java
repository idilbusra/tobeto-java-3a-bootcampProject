package com.tobeto.bootcampProject.dataaccess;

import com.tobeto.bootcampProject.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public class EmployeeRepository {
    import com.tobeto.java3a.bootcampproject.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    }
}
