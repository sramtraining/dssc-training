package com.dssc.training.rithwik;

//POJO
public class student {


    // Encapsulation


    public student() {
    }

    public student(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public student(String name, Integer age, Integer id, Integer standard) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.standard = standard;
    }


    private String name;
    private Integer age;
    private Integer id;
    private Integer standard;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

}