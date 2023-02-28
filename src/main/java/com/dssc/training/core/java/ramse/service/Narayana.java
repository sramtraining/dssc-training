package com.dssc.training.core.java.ramse.service;

import com.dssc.training.core.java.ramse.interfaces.ISchool;
import com.dssc.training.core.java.ramse.dto.Student;

public class Narayana implements ISchool {
    public Student getStandard() {
        return createStudent("Siva", 16, 2, 5);
    }

    public Student getStudent() {
        return createStudent();
    }

    //Polymorphism - Method Overloading
    private  Student createStudent() {
        Student student1 = new Student();

        student1.setName("Ram");
        student1.setAge(16);
        student1.setId(1);
        return student1;
    }

    private Student createStudent(String name, Integer age, Integer id) {
        return new Student(name, age, id);
    }


    private Student createStudent(String name, Integer age, Integer id, Integer standard) {
        return new Student(name, age, id, standard);
    }
}
