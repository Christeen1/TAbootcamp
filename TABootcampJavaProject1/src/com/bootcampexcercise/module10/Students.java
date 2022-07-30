package com.bootcampexcercise.module10;

public class Students extends Person {

    private String schoolName;


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduce() {
        System.out.println("I am studying in " + schoolName + " university");
    }
}