package com.tobeto.bootcampProject.dataaccess;

import com.tobeto.bootcampProject.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public class ApplicantRepository {
    import com.tobeto.bootcampProject.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
    }
}
