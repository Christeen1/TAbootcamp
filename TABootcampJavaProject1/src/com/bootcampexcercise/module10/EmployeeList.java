package com.bootcampexcercise.module10;
import com.bootcampexcercise.module10.Employee;
import javax.management.loading.MLet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class EmployeeList {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(2500.00, "Test Automation Engineer", "Accenture"));
        empList.add(new Employee(4500.00, "Senior Java engineer", "I&D"));
        empList.add(new Employee(5300.00, "DevOps Engineer", "JJS"));
        empList.add(new Employee(2200.00, "QA Specialist", "U&WW"));
        empList.add(new Employee(2000.00, "Business Analyst", "U&msn"));

        Employee employee = new Employee();
        System.out.println(empList);
        System.out.println("The Employee highest salary is " + employee.getHighestPaidEmp(empList));
    }
}
