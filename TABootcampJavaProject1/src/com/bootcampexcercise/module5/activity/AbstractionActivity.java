package com.bootcampexcercise.module5.activity;

public class AbstractionActivity {
    public static void main(String args[]) {

        Shape rectangle = new Rectangle();
        rectangle.setColour("violet");
        System.out.println("The colour of rectangle is: " + rectangle.getColour());
        rectangle.setHeight(6);
        rectangle.setWidth(2);
        System.out.println("The area of rectangle is: " + rectangle.calculateArea());
        System.out.println("The perimeter of rectangle is: " + rectangle.calculatePerimeter());

        //set and  Print color of rectangle
// Give area of rectangle
// Print perimeter of rectangle
        Shape circle = new Circle();
        circle.setColour("white");
        System.out.println("The colour of circle is: " + circle.getColour());
        circle.setRadius(18);
System.out.println("The area of circle is: "+circle.getRadius());
System.out.println("The perimeter of circle is:"+circle.calculatePerimeter());}}
// set and Print color of circle
// Give area of circle
// Print perimeter of circle
