package com.bootcampexcercise.module5.activity;

public class InheritanceActivity {

    public static void main(String[] args) {

        // Create Person object p. Write code to and set name of Person as Sarah Johnson
        // and age as 21
        Person_I p = new Person_I();

        p.setName("Sarah Johnson");
        p.setAge(21);

        System.out.println("-----------------------------");
        //Create Employee object e and
        // set salary as 70000.00, title as Developer, age as 32 and name as Shawn Cun
        Employee_I employee = new Employee_I();
        employee.salary(70000.00);
        employee.setTitle("Developer");
        employee.name("Shawn Cun");
        employee.age("32");

        // Print Info using Employee object
        System.out.println("-----------------------------");
        System.out.println("Employee's Grade is  : " + employee.getSalary());
        System.out.println("Employee's School is : " + employee.getTitle());

        // Print Info using Person object
        System.out.println("-----------------------------");
        System.out.println("Person's Name is    : " + p.getName());
        System.out.println("Person's Age is     : " + p.getAge());

    }

}