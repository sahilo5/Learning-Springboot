package com.Learning.SpringSecurityDemo.services;

import com.Learning.SpringSecurityDemo.dto.studentDto;
import com.Learning.SpringSecurityDemo.models.student;
import com.Learning.SpringSecurityDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public boolean createStudent(studentDto studentDto) {
        student stud = new student();
        stud.setName(studentDto.getName());
        stud.setEmail(studentDto.getEmail());

        studentRepository.save(stud);
        System.out.println("Student saved successfully");
        return true;
    }

    @Override
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }

}
