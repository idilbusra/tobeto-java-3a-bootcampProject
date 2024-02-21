package com.tobeto.bootcampProject.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class ApplicantManager implements ApplicantService {
    private final ApplicantRepository applicantRepository;
    private final ModelMapperService mapperService;

    @Autowired
    public ApplicantManager(ApplicantRepository applicantRepository, ModelMapperService mapperService) {
        this.applicantRepository = applicantRepository;
        this.mapperService = mapperService;
    }

    @Override
    public CreateApplicantRequest add(CreateApplicantRequest request) {
        Applicant applicant = mapperService.forRequest().map(request, Applicant.class);
        applicant.setCreatedDate(LocalDateTime.now());
        applicantRepository.save(applicant);

        CreateApplicantResponse response = mapperService.forResponse()
                .map(applicant, CreateApplicantResponse.class);
        return response;
    }

    @Override
    public void delete(int id) {
        applicantRepository.deleteById(id);
    }

    @Override
    public void update(CreateApplicantRequest request) {
    }


    @Override
    public GetApplicantResponse getById(int id) {
        Applicant applicant = applicantRepository.getById(id);
        GetApplicantResponse response = mapperService.forResponse().map(applicant, GetApplicantResponse.class);
        return response;
    }
}