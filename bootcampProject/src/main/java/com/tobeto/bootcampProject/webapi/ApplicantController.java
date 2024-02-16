package com.tobeto.bootcampProject.webapi;

import com.tobeto.bootcampProject.dataacces.ApplicantRepository;
import com.tobeto.bootcampProject.dataaccess.ApplicantRepository;
import com.tobeto.bootcampProject.entities.Applicant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/applicants")

public class ApplicantController {
    private ApplicantRepository applicantRepository;

        public ApplicantController(ApplicantRepositoryitory applicantRepository) {
            this.applicantRepository = applicantRepository;
        }

        @RequestMapping("/getall")
        public List<Applicant> findAll() {
            List<Applicant> applicants = applicantRepository.findAll();
            return applicants;
        }

        @RequestMapping("/save")
        public Applicant applicant() {
            Applicant applicant = new Applicant();
            applicant.setUsername("username");
            applicant.setFirstName("first");
            applicant.setLastName("last");
            applicant.setEmail("firstlast@fakemail.net");
            applicant.setAbout("deneme");
            applicant.setPassword("1234");
            applicantRepository.save(applicant);
            return applicant;
        }
    }


