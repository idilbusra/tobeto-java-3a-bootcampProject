package com.tobeto.bootcampProject.business.abstracts;


import com.tobeto.bootcampProject.business.dto.requests.CreateEmployeeRequest;
import com.tobeto.bootcampProject.business.dto.responses.GetEmployeeResponse;

public interface EmployeeService {
    CreateEmployeeRequest add(CreateEmployeeRequest request);
    void delete(int id);
    void update(CreateEmployeeRequest request);
    GetEmployeeResponse getById(int id);
}