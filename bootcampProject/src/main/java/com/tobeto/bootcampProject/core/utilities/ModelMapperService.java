package com.tobeto.bootcampProject.core.utilities;

public interface ModelMapperService {
    ModelMapper forRequest();
    ModelMapper forResponse();
}