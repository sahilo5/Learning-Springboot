package com.Learning.SpringSecurityDemo.services;

import com.Learning.SpringSecurityDemo.dto.studentDto;
import com.Learning.SpringSecurityDemo.models.student;

import java.util.List;

public interface StudentService {
    public boolean createStudent(studentDto studentDto);
    public List<student> getAllStudents();
}