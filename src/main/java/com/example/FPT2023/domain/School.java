package com.example.FPT2023.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "schools")
@Entity
@Setter
@Getter
public class School {

    @Id
    private Long maTruong;

    
    private String tenTruong;


    private String diaChi;

    private String soDT;

  
    @Override
    public String toString() {
        return "School [maTruong=" + maTruong + ", tenTruong=" + tenTruong + ", diaChi=" + diaChi + ", soDT=" + soDT
                + "]";
    }

}
