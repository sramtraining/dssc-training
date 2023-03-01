package com.dssc.training.rithwik;

import com.dssc.training.rithwik.student;

public class Aditya implements Ischool {
    public student getStandard() {
        return createStudent("Siva", 16, 2, 5);
    }

    public student getStudent() {
        return createStudent();
    }

    //Polymorphism - Method Overloading
    private student createStudent() {
        student student1 = new student();

        student1.setName("Ram");
        student1.setAge(16);
        student1.setId(1);
        return student1;
    }

    private student createStudent(String name, Integer age, Integer id) {
        return new student(name, age, id);
    }


    private student createStudent(String name, Integer age, Integer id, Integer standard) {
        return new student(name, age, id, standard);
    }
}