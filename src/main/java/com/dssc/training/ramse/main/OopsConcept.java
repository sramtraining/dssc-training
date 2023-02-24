package com.dssc.training.ramse.main;

import com.dssc.training.ramse.dto.Student;
import com.dssc.training.ramse.service.Aditya;
import com.dssc.training.ramse.service.Narayana;
import com.dssc.training.ramse.service.NewYorkSchool;

import java.util.ArrayList;
import java.util.List;

//Class
public class OopsConcept {


    //Public, Private, Proctected, Default

    public static void main(String[] args) {

        //Object
        Narayana narayanaSchool = new Narayana();
        List<Student> narayanaStudentList = new ArrayList<Student>();

        narayanaStudentList.add(narayanaSchool.getStandard());
        narayanaStudentList.add(narayanaSchool.getStudent());


        Aditya adityaSchool = new Aditya();
        List<Student> adityaSchoolList = new ArrayList<Student>();

        adityaSchoolList.add(adityaSchool.getStandard());
        adityaSchoolList.add(adityaSchool.getStudent());





        NewYorkSchool newYorkSchool = new NewYorkSchool();
        List<Student> newYorkSchoolList = new ArrayList<Student>();

        newYorkSchoolList.add(newYorkSchool.getStandard());
        newYorkSchoolList.add(newYorkSchool.getStudent());
        //Inheritance
        newYorkSchoolList.add(newYorkSchool.getModernStudent());

    }


}
