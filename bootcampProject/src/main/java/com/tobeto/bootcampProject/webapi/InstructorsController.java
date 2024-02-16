package com.tobeto.bootcampProject.webapi;

import com.tobeto.java3a.bootcampproject.dataaccess.InstructorRepository;
import com.tobeto.java3a.bootcampproject.entities.Instructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController("/instructors")
    public class InstructorsController {

        private InstructorRepository instructorRepository;

        public InstructorsController(InstructorRepository instructorRepository) {
            this.instructorRepository = instructorRepository;
        }

        @RequestMapping("/")
        public List<Instructor> findAll() {
            return instructorRepository.findAll();
        }

        @RequestMapping("/add")
        public void add() {
            Instructor instructor = new Instructor();
            instructor.setUserName("doejane");
            instructor.setEmail("doejane@gmail.com");
            instructor.setCompanyName("doecomp");
            instructorRepository.save(instructor);
        }

}
