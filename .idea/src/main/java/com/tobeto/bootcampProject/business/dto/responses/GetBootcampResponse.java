package com.tobeto.bootcampProject.business.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBootcampResponse {
    private String name;
    private int instructorId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int bootcampStateId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime deletedDate;
}