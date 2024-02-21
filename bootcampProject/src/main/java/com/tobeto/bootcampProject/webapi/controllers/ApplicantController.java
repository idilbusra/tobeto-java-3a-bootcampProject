package com.tobeto.bootcampProject.webapi.controllers;


import com.tobeto.bootcampProject.business.abstracts.ApplicantService;
import com.tobeto.bootcampProject.business.dto.responses.GetApplicantResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/applicants")
public class ApplicantController {
    private final ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @PostMapping("/add")
    public CreateApplicantResponse addApplicant(@RequestBody CreateApplicantRequest request) {
        return applicantService.add(request);
    }

    @GetMapping("/get/{id}")
    public GetApplicantResponse getApplicantById(@PathVariable int id) {
        return applicantService.getById(id);
    }

    @GetMapping("/get/all")
    public List<GetAllApplicantResponse> getAllApplicants() {
        return applicantService.getAll();
    }

    @PutMapping("/update")
    public void updateApplicant(@RequestBody CreateApplicantRequest request) {
        applicantService.update(request);
    }

    @DeleteMapping("delete/{id}")
    public void deleteApplicant(@PathVariable int id) {
        applicantService.delete(id);
    }
}
