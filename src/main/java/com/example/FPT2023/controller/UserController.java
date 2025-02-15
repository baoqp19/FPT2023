package com.example.FPT2023.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.FPT2023.domain.dto.StudentAndGraduteDTO;
import com.example.FPT2023.service.StudentService;

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
    public String createUser(Model model, @ModelAttribute("newUser") StudentAndGraduteDTO studentAndGraduteDTO) {
        this.studentService.ConvertDtotoStudentAndGraudateService(studentAndGraduteDTO);
        return "redirect:/student/create";
    }

}
