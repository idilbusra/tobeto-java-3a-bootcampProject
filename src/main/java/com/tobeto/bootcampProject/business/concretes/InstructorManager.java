package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.dto.requests.CreateInstructorRequest;
import com.tobeto.bootcampProject.business.dto.responses.GetInstructorResponse;
import com.tobeto.bootcampProject.entities.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class InstructorManager implements InstructorService {
    private final InstructorRepository instructorRepository;
    private final ModelMapperService mapperService;

    @Autowired
    public InstructorManager(InstructorRepository instructorRepository, ModelMapperService mapperService) {
        this.instructorRepository = instructorRepository;
        this.mapperService = mapperService;
    }

    @Override
    public CreateInstructorResponse add(CreateInstructorRequest request) {
        Instructor instructor = mapperService.forRequest().map(request, Instructor.class);
        instructor.setCreatedDate(LocalDateTime.now());
        instructorRepository.save(instructor);

        CreateInstructorResponse response = mapperService.forResponse()
                .map(instructor, CreateInstructorResponse.class);
        return response;
    }

    @Override
    public void delete(int id) {
        instructorRepository.deleteById(id);

    }

    @Override
    public void update(CreateInstructorRequest request) {
    }



    @Override
    public GetInstructorResponse getById(int id) {
        Instructor instructor = instructorRepository.getById(id);
        GetInstructorResponse response = mapperService.forResponse().map(instructor,GetInstructorResponse.class);
        return response;
    }
}
