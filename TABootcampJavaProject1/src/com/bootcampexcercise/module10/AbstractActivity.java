package com.bootcampexcercise.module10;

public abstract class AbstractActivity {
    public static void main(String[] args) {

        Person pE = new Employee();
        pE.setName("Janis");
        pE.setAge(48);
        pE.introduceName();

        Employee employee = new Employee();
        employee.setJobTitle("Back-end developer");
        employee.setCompanyName("Accenture");
        employee.setSalary(2000);
        employee.introduce();

        Students students = new Students();
        students.setSchoolName("RTU");
        students.introduce();

    }
}
