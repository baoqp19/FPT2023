package com.example.FPT2023.domain.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentAndGraduteDTO {

    @NotNull(message = "Số CMND không được để trống")
    private Long soCMND;

    @NotNull(message = "Họ tên không được để trống")
    @Size(min = 1, message = "Họ tên phải có ít nhất 1 ký tự")
    private String hoTen;

    private String email;

    private Long soDT;

    private String diaChi;

    @NotNull(message = "Mã trường không được để trống")
    private Long maTruong;

    @NotNull(message = "Mã ngành không được để trống")
    private Long maNganh;

    private String heTN;

    @NotNull(message = "Ngày tốt nghiệp không được để trống")
    @Past(message = "Ngày tốt nghiệp phải là ngày trong quá khứ") // Kiểm tra ngày phải là quá khứ
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Định dạng ngày khi nhận dữ liệu từ form
    private LocalDate ngayTN;

    private String LoaiTN;

}
