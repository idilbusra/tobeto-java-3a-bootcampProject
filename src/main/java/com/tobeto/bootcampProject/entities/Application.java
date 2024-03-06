package com.tobeto.bootcampProject.entities;

import com.tobeto.bootcampProject.core.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name="applications")
    public class Application extends BaseEntity<Integer> {
        @ManyToOne
        @JoinColumn(name = "applicant_id")
        private User applicant;

        @ManyToOne
        @JoinColumn(name = "bootcamp_id")
        private Bootcamp bootcamp;

        @ManyToOne
        @JoinColumn(name = "applicationState_id")
        private ApplicationState applicationState;

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @Entity
        @Table(name="application_states")
        public static class ApplicationState extends BaseEntity<Integer> {
                @Column(name = "name")
                private String name;
            }
    }
