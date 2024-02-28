package com.tobeto.bootcampproject.business.abstracts;

import com.tobeto.bootcampproject.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.bootcampproject.business.responses.create.applicant.CreateApplicantResponse;

public interface ApplicantService {
   CreateApplicantResponse create(CreateApplicantRequest createApplicantRequest);
}
