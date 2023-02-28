package com.dssc.training.siddardha.service;

import com.dssc.training.siddardha.abstracts.Employerabstract;
import com.dssc.training.siddardha.dto.Employee;

public class Employer1 extends Employerabstract {
    public Employee getPosition() {
        return createEmployee("Siddardha", 25, 2, "DevOps");
    }

    public Employee getEmployee() {
        return createStudent();
    }

    //Polymorphism - Method Overloading
    private Employee createStudent() {
        Employee employee1 = new Employee();

        employee1.setName("Ram");
        employee1.setAge(16);
        employee1.setId(1);
        return employee1;
    }

    private Employee createEmployee(String name, Integer age, Integer id) {

        return new Employee(name, age, id);
    }


    private Employee createEmployee(String name, Integer age, Integer id, String position) {
        return new Employee(name, age, id, position);
    }
}
