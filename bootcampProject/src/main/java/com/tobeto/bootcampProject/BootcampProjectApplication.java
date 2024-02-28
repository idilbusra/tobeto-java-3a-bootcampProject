package com.tobeto.bootcampproject;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootcampprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampprojectApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}

}
