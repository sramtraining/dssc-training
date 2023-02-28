package com.dssc.training.siddardha.dto;

//POJO
public class Employee {
    private String name;
    private Integer age;
    private Integer id;
    private String position;

    public Employee(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
// Encapsulation


    public Employee() {
    }



    public Employee(String name, Integer age, Integer id, String position) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.position = position;
    }



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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }





}
