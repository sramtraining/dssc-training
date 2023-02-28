package com.dssc.training.siddardha.main;

import com.dssc.training.siddardha.dto.Employee;
import com.dssc.training.siddardha.service.Employer1;
import com.dssc.training.siddardha.service.Employer2;

import java.util.ArrayList;
import java.util.List;

//Class
public class OopsConcept {


    //Public, Private, Proctected, Default

    public static void main(String[] args) {

        //Object
        Employer1 employer1employee = new Employer1();
        List<Employee> employer1EmployeeList = new ArrayList<Employee>();

        employer1EmployeeList.add(employer1employee.getPosition());
        employer1EmployeeList.add(employer1employee.getEmployee());

        Employer2 employer2employee = new Employer2();
        List<Employee> employer2EmployeeList = new ArrayList<Employee>();

        employer2EmployeeList.add(employer2employee.getPosition());
        employer2EmployeeList.add(employer2employee.getEmployee());



    }


}
