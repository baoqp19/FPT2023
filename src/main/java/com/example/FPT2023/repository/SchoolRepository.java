package com.example.FPT2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FPT2023.domain.School;


@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}
