package com.example.FPT2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FPT2023.domain.Work;

public interface WorkRepository extends JpaRepository<Work, Long> {

}
