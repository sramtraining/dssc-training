package com.dssc.training.rithwik;

public class modelschool {

    //Abstraction -- 0 to 100%
    protected abstract student getStandard();

    public abstract student getStudent();

    public student getModernStudent() {
        return new student("John", 10, 12, 4);
    }
}
