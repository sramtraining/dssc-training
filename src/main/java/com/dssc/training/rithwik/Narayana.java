package com.dssc.training.rithwik;

import com.dssc.training.rithwik.Ischool;

public class Narayana implements Ischool {
    public tudent getStandard() {
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
Footer