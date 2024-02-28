package com.tobeto.bootcampproject.webapi;

import com.tobeto.bootcampproject.business.abstracts.ApplicantService;
import com.tobeto.bootcampproject.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.bootcampproject.business.responses.create.applicant.CreateApplicantResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/applicants")
@AllArgsConstructor
public class ApplicantController {

    private ApplicantService applicantService;

    @PostMapping
    public CreateApplicantResponse create(@RequestBody CreateApplicantRequest createApplicantRequest){
        CreateApplicantResponse result = applicantService.create(createApplicantRequest);
        return result;
    }

}
