package com.example.start.user.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long index;

    private String name;

    private String id;

    private String phoneNumber;


}
