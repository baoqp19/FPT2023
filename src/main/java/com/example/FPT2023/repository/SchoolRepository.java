package com.example.FPT2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FPT2023.domain.School;

public interface SchoolRepository extends JpaRepository<School, Long> {

}
