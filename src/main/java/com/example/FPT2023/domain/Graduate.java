package com.example.FPT2023.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "graduates")
@Getter
@Setter
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

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // maNganh đầu tiên là của Graduate, thứ 2 là của Branch
    @ManyToOne
    @JoinColumn(name = "maNganh", referencedColumnName = "maNganh", insertable = false, updatable = false)
    private Branch branch; // Khóa ngoại

    @ManyToOne
    @JoinColumn(name = "maTruong", referencedColumnName = "maTruong", insertable = false, updatable = false)
    private School school; // Khóa ngoại

}
