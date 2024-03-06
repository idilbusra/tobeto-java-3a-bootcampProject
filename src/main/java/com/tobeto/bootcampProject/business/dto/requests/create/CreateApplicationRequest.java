package com.tobeto.bootcampProject.business.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateApplicationRequest {
    private int id;
    private int applicantId;
    private int bootcampId;
    private int applicationStateId;
}