package com.tobeto.bootcampProject.business.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBootcampRequest {
    private int id;
    private String name;
    private int instructorId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int bootcampStateId;
}