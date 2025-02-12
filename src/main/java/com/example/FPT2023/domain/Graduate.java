package com.example.FPT2023.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "graduates")
@Setter
@Getter
public class Graduate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long soCMND;

    private Long maTruong;

    private Long maNganh;

    private String heTN;

    private String ngayTN;

    private String LoaiTN;

    @Override
    public String toString() {
        return "Graduate [soCMND=" + soCMND + ", maTruong=" + maTruong + ", maNganh=" + maNganh + ", heTN=" + heTN
                + ", ngayTN=" + ngayTN + ", LoaiTN=" + LoaiTN + "]";
    }

}
