package com.tobeto.bootcampProject.business.abstracts;


public interface InstructorService {
    CreateInstructorRequest add(CreateInstructorRequest request);
    void delete(int id);
    void update(CreateInstructorRequest request);
    GetInstructorResponse getById(int id);
}