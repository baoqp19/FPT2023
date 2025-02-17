package com.example.FPT2023.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.FPT2023.domain.dto.StudentAndGraduteDTO;
import com.example.FPT2023.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class UserController {

    private final StudentService studentService;

    public UserController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student/create")
    public String getCreateUserPage(Model model) {
        model.addAttribute("newUser", new StudentAndGraduteDTO());
        return "student/create";
    }

    @PostMapping("/student/create")
    public String createUser(
            Model model,
            @Valid @ModelAttribute("newUser") StudentAndGraduteDTO studentAndGraduteDTO,
            BindingResult newUserBindingResult) {

        // In lỗi ra console (chỉ dùng để debug)
        List<FieldError> errors = newUserBindingResult.getFieldErrors();
        for (FieldError error : errors) {
            System.out.println(">>>>" + error.getField() + " - " + error.getDefaultMessage());
        }

        // Nếu có lỗi, quay lại trang nhập form và hiển thị lỗi
        if (newUserBindingResult.hasErrors()) {
            model.addAttribute("newUser", studentAndGraduteDTO); // Trả lại dữ liệu đã nhập
            return "student/create"; // Quay về form JSP
        }

        // Nếu hợp lệ, xử lý dữ liệu và chuyển hướng
        this.studentService.ConvertDtotoStudentAndGraudateService(studentAndGraduteDTO);
        return "redirect:/student/create"; // Chuyển hướng sau khi submit thành công
    }

}
