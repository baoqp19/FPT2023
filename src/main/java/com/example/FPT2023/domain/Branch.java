package com.example.FPT2023.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "branchs")
@Entity
@Setter
@Getter
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maNganh;

    private String tenNganh;

    private String loaiNganh;

    @Override
    public String toString() {
        return "Branch [maNganh=" + maNganh + ", tenNganh=" + tenNganh + ", loaiNganh=" + loaiNganh + "]";
    }

}
