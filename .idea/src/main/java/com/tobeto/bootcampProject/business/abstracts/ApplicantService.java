package com.tobeto.bootcampProject.business.abstracts;


import com.tobeto.bootcampProject.business.dto.requests.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.dto.responses.GetApplicantResponse;

public interface ApplicantService {
    CreateApplicantRequest add(CreateApplicantRequest request);
    void delete(int id);
    void update(CreateApplicantRequest request);

    GetApplicantResponse getById(int id);
}