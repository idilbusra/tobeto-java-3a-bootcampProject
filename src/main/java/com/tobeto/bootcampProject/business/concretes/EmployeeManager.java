package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.EmployeeService;
import com.tobeto.bootcampProject.business.dto.requests.CreateEmployeeRequest;
import com.tobeto.bootcampProject.business.dto.responses.GetEmployeeResponse;
import com.tobeto.bootcampProject.core.utilities.ModelMapperService;
import com.tobeto.bootcampProject.dataaccess.abstracts.EmployeeRepository;
import com.tobeto.bootcampProject.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;


@Service
public class EmployeeManager implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapperService mapperService;

    @Autowired
    public EmployeeManager(EmployeeRepository employeeRepository, ModelMapperService mapperService) {
        this.employeeRepository = employeeRepository;
        this.mapperService = mapperService;
    }

    @Override
    public CreateEmployeeResponse add(CreateEmployeeRequest request) {
        Employee employee = mapperService.forRequest().map(request, Employee.class);
        employee.setCreatedDate(LocalDateTime.now());
        employeeRepository.save(employee);

        CreateEmployeeResponse response = mapperService.forResponse()
                .map(employee, CreateEmployeeResponse.class);
        return response;
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }



    @Override
    public GetEmployeeResponse getById(int id) {
        Employee employee = employeeRepository.getById(id);
        GetEmployeeResponse response = mapperService.forResponse().map(employee, GetEmployeeResponse.class);
        return response;
    }
}
