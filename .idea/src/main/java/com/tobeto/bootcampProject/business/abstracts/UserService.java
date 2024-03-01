package com.tobeto.bootcampProject.business.abstracts;


import com.tobeto.bootcampProject.business.dto.requests.CreateUserRequest;
import com.tobeto.bootcampProject.business.dto.responses.GetUserResponse;

public interface UserService {
    CreateUserRequest add(CreateUserRequest request);
    void delete(int id);
    void update(CreateUserRequest request);

    GetUserResponse getById(int id);
    GetUserResponse getByEmail(String email);
}