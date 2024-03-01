package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.dto.requests.CreateUserRequest;
import com.tobeto.bootcampProject.business.dto.responses.GetUserResponse;
import com.tobeto.bootcampProject.core.utilities.ModelMapperService;
import com.tobeto.bootcampProject.dataaccess.abstracts.UserRepository;
import com.tobeto.bootcampProject.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class UserManager implements UserService {
    private final UserRepository userRepository;
    private final ModelMapperService mapperService;

    @Autowired
    public UserManager(UserRepository userRepository, ModelMapperService mapperService) {
        this.userRepository = userRepository;
        this.mapperService = mapperService;
    }

    @Override
    public CreateUserResponse add(CreateUserRequest request) {
        User user = mapperService.forRequest().map(request, User.class);
        user.setCreatedDate(LocalDateTime.now());
        userRepository.save(user);

        CreateUserResponse response = mapperService.forResponse()
                .map(user, CreateUserResponse.class);
        return response;
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void update(CreateUserRequest request) {
    }


    @Override
    public GetUserResponse getById(int id) {
        User user = userRepository.getById(id);
        GetUserResponse response = mapperService.forResponse().map(user, GetUserResponse.class);
        return response;
    }

    @Override
    public GetUserResponse getByEmail(String email) {
        User user = userRepository.getByEmail(email);
        GetUserResponse response = mapperService.forResponse().map(user, GetUserResponse.class);
        return response;
    }