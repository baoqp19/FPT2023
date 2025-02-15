package com.example.FPT2023.domain;

import java.security.Permission;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "students")
@Entity
@Setter
@Getter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID tự động tăng
    private Long id;

    @Column(unique = true) // Đảm bảo soCMND không trùng nhau
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

    @OneToMany(mappedBy = "student")
    List<Graduate> graduates;

    @ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = { "students" })
    @JoinTable(name = "works_student", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "work_id"))
    private List<Work> works;

}
