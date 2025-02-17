package com.example.FPT2023.domain;

import java.time.Instant;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
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

    @NotNull
    private Long soCMND;

    @NotNull
    private Long maTruong;

    @NotNull
    private Long maNganh;

    private String heTN;

    @NotNull(message = "Ngày tốt nghiệp không được để trống")
    @Past(message = "Ngày tốt nghiệp phải là ngày trong quá khứ") // Kiểm tra ngày hợp lệ
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Định dạng ngày đúng khi nhận từ JSP
    private LocalDate ngayTN;

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
