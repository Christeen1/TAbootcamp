
package com.bootcampexcercise.module10;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Employee extends Person {

    private double salary;
    private String jobTitle;
    private String companyName;

public Employee(){
    this.salary = 3000;
    this.jobTitle = "Unemployed";
    this.companyName = "Unavailable";
}
        public Employee( Double salary, String jobTitle, String companyName) {
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void introduce() {
    System.out.println("I am working as " + getJobTitle() + " in company "+ getCompanyName() +" and my salary is " + getSalary());
    }


    public double getHighestPaidEmp(List<Employee> empList) {
        double max = 0;
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getSalary() > max) {
                max = empList.get(i).getSalary();
            }
        }
        return max;
    }
}


