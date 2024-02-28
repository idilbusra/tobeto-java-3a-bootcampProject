package com.tobeto.bootcampproject.business.concretes;

import com.tobeto.bootcampproject.business.abstracts.ApplicantService;
import com.tobeto.bootcampproject.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.bootcampproject.business.responses.create.applicant.CreateApplicantResponse;
import com.tobeto.bootcampproject.core.modelmapper.ModelMapperService;
import com.tobeto.bootcampproject.dataaccess.abstracts.ApplicantRepository;
import com.tobeto.bootcampproject.entities.concretes.Applicant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ApplicantManager implements ApplicantService {
    private ApplicantRepository applicantRepository;
    private ModelMapperService modelMapperService;
    @Override
    public CreateApplicantResponse create(CreateApplicantRequest createApplicantRequest) {
        Applicant applicantToBeCreate = modelMapperService.forRequest()
                .map(createApplicantRequest,Applicant.class);
        applicantRepository.save(applicantToBeCreate);

        CreateApplicantResponse response = modelMapperService.forResponse()
                .map(applicantToBeCreate,CreateApplicantResponse.class);
        return response;
    }
}
