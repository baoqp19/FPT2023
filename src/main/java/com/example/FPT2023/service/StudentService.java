package com.example.FPT2023.service;

import org.springframework.stereotype.Service;

import com.example.FPT2023.domain.Graduate;
import com.example.FPT2023.domain.Student;
import com.example.FPT2023.domain.dto.StudentAndGraduteDTO;
import com.example.FPT2023.repository.GraduateRepository;
import com.example.FPT2023.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final GraduateRepository graduateRepository;

    public StudentService(StudentRepository studentRepository, GraduateRepository graduateRepository) {
        this.studentRepository = studentRepository;
        this.graduateRepository = graduateRepository;
    }

    public String ConvertDtotoStudentAndGraudateService(StudentAndGraduteDTO studentAndGraduteDTO) {
        Student student = new Student();
        Graduate graduate = new Graduate();

        student.setDiaChi(studentAndGraduteDTO.getDiaChi());
        student.setSoCMND(studentAndGraduteDTO.getSoCMND());
        student.setHoTen(studentAndGraduteDTO.getHoTen());
        student.setEmail(studentAndGraduteDTO.getEmail());
        student.setSoDT(studentAndGraduteDTO.getSoDT());

        this.studentRepository.save(student);

        graduate.setSoCMND(studentAndGraduteDTO.getSoCMND());
        graduate.setMaNganh(studentAndGraduteDTO.getMaNganh());
        graduate.setMaTruong(studentAndGraduteDTO.getMaTruong());
        graduate.setNgayTN(studentAndGraduteDTO.getNgayTN());
        graduate.setHeTN(studentAndGraduteDTO.getHeTN());
        graduate.setLoaiTN(studentAndGraduteDTO.getLoaiTN());

        graduate.setStudent(student);

        this.graduateRepository.save(graduate);

        return "compele";
    }

}
