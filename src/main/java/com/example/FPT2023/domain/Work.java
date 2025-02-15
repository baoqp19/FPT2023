package com.example.FPT2023.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "works")
@Entity
@Setter
@Getter
public class Work {

    @Id
    private Long ngayVaoCongTy;

    private Long soCMND;

    private Long maNganh;

    private String tenCongViec;

    private String tenCongTy;

    private String diaChiCongTy;

    private String thoiGianLamViec;

    @Override
    public String toString() {
        return "Work [ngayVaoCongTy=" + ngayVaoCongTy + ", soCMND=" + soCMND + ", maNganh=" + maNganh + ", tenCongViec="
                + tenCongViec + ", tenCongTy=" + tenCongTy + ", diaChiCongTy=" + diaChiCongTy + ", thoiGianLamViec="
                + thoiGianLamViec + "]";
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "works")
    @JsonIgnore
    private List<Student> students;

}
