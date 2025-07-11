package com.Learning.SpringSecurityDemo.controllers;

import com.Learning.SpringSecurityDemo.dto.studentDto;
import com.Learning.SpringSecurityDemo.models.student;
import com.Learning.SpringSecurityDemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<Boolean> createStudent(@RequestBody studentDto studDto) {
        boolean isCreated = studentService.createStudent(studDto);
        return ResponseEntity.ok(isCreated);
    }

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<student>> getAllStudents() {
        List<student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }
}
