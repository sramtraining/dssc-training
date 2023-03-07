package com.dssc.training.controller;

import com.dssc.training.dto.Student;
import com.dssc.training.service.Aditya;
import com.dssc.training.service.Narayana;
import com.dssc.training.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    Narayana narayanaSchool;

    @Autowired
    Aditya adityaSchool;

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/getStudenstBySchool")
    public List<Student> getStudentBySchool(String school) {
        System.out.println(school);
        List<Student> studentList = new ArrayList<Student>();
        if (school.equalsIgnoreCase("narayana")) {

            studentList.add(narayanaSchool.getStandard());
            studentList.add(narayanaSchool.getStudent());


        } else if (school.equalsIgnoreCase("aditya")) {

            studentList.add(adityaSchool.getStandard());
            studentList.add(adityaSchool.getStudent());


        }
        return studentRepository.findAll();

      //  return studentList;
    }
}
