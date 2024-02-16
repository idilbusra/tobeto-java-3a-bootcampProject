package com.tobeto.bootcampProject.dataaccess;

import com.tobeto.bootcampProject.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public class InstructorRepository {
    import com.tobeto.java3a.bootcampproject.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    }
}
