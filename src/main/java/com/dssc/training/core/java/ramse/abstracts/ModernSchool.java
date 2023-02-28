package com.dssc.training.core.java.ramse.abstracts;

import com.dssc.training.core.java.ramse.dto.Student;

public abstract class ModernSchool {

    //Abstraction -- 0 to 100%
    protected abstract Student getStandard();

    public abstract Student getStudent();

    public Student getModernStudent() {
        return new Student("John", 10, 12, 4);
    }

}
