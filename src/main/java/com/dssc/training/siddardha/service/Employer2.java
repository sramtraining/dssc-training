package com.dssc.training.siddardha.service;

import com.dssc.training.siddardha.dto.Employee;
import com.dssc.training.siddardha.interfaces.IEmployee;

public class Employer2 implements IEmployee {
    public Employee getPosition() {
        return createEmployee("Sid", 22, 2, "Software");
    }

    public Employee getEmployee() {
        return createEmployee();
    }

    //Polymorphism - Method Overloading
    private Employee createEmployee() {
        Employee student1 = new Employee();

        student1.setName("Ram");
        student1.setAge(16);
        student1.setId(1);
        return student1;
    }

    private Employee createEmployee(String name, Integer age, Integer id) {
        return new Employee(name, age, id);
    }


    private Employee createEmployee(String name, Integer age, Integer id, String position) {
        return new Employee(name, age, id, position);
    }

}
