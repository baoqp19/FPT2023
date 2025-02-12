package com.example.FPT2023.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "students")
@Entity
@Setter
@Getter
public class Student {

    @Id
    private Long soCMND;

    private String hoTen;

    private String email;

    private Long soDT;

    private String diaChi;

    @Override
    public String toString() {
        return "Student [soCMND=" + soCMND + ", hoTen=" + hoTen + ", email=" + email + ", soDT=" + soDT + ", diaChi="
                + diaChi + "]";
    }

}
