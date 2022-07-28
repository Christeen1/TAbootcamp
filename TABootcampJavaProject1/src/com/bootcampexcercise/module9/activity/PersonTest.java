package com.bootcampexcercise.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testSetAndGetWeight() {
        int weight = 65;
        person.setWeight(weight);
        assertEquals(weight, person.getWeight());

        int weight1 = -40;
        person.setWeight(weight);
        assertEquals(weight, person.getWeight());

        int weight2 = 350;
        person.setWeight(weight);
        assertEquals(weight, person.getWeight());
    }

    public void testSetAndWeight() {
        float height = 1.5f;
        person.setHeight(height);
        assertEquals(height, person.getHeight());

        float height1 = 0.2f;
        person.setHeight(height);
        assertEquals(height, person.getHeight());

        float height2 = -1;
        person.setHeight(height);
        assertEquals(height, person.getHeight());
    }

//TODO: create unit test for getBodyMassIndex method

    public void testCalculateBMI() {
// Test with valid weight and valid height

        int weight = 51;
        float height = 120;
        person.setWeight(weight);
        person.setHeight(height);
        double bmiExpected = weight / (height * weight);
        assertEquals(bmiExpected, person.calculateBmi());}

    public void testCalculateBMI1() {

// Test with 0 height and 0 weight
        int weight = 0;
        float height = 0;
        person.setWeight(weight);
        person.setHeight(height);
        double bmiExpected1 = weight / (height * weight);
        String errorMessage = "Error. Values can't be zero.";
        assertEquals(errorMessage, person.calculateBmi());}

    //Boundaries(valid values for weight: 20-300, valid values for height 120-251)

    public void testCalculateBmi2() {
        int weight = 19;
        float height = 119;
        person.setWeight(weight);
        person.setHeight(height);
        String errorMessage = "Error.";
        assertEquals(errorMessage, person.calculateBmi());}

    public void testCalculateBmi3() {
        int weight = 20;
        float height = 120;
        person.setWeight(weight);
        person.setHeight(height);
        String errorMessage = "Error.";
        assertEquals(errorMessage, person.calculateBmi());}

    public void testCalculateBmi4() {
        int weight = 300;
        float height = 251;
        person.setWeight(weight);
        person.setHeight(height);
        double bmiExpected2 = weight / (height * weight);
        assertEquals(bmiExpected2, person.calculateBmi());}

   // Test with valid height and invalid weight
    public void testCalculateBmi5() {
        int weight = 5;
        float height = 150;
        person.setWeight(weight);
        person.setHeight(height);
        String errorMessage = "Error. Impossible weight";
        assertEquals(errorMessage, person.calculateBmi());}

//Test with valid weight and invalid height
    public void testCalculateBmi6() {
        int weight = 85;
        float height = 450;
        person.setWeight(weight);
        person.setHeight(height);
       String errorMessage = "Error. Impossible height";
        assertEquals(errorMessage, person.calculateBmi());}
//test with 0 height un valid weight
public void testCalculateBmi7() {
    int weight = 299;
    float height = 0;
    person.setWeight(weight);
    person.setHeight(height);
    String errorMessage = "Error. Values can't be zero.";
    assertEquals(errorMessage, person.calculateBmi());}
//test with 0 weight and valid height
    public void testCalculateBmi8() {
        int weight = 0;
        float height = 189;
        person.setWeight(weight);
        person.setHeight(height);
        String errorMessage = "Error. Values can't be zero.";
        assertEquals(errorMessage, person.calculateBmi());}
//test with negative weight value and valid height
    public void testCalculateBmi9() {
        int weight = -98;
        float height = 174;
        person.setWeight(weight);
        person.setHeight(height);
        String errorMessage = "Error. Values can't be zero.";
        assertEquals(errorMessage, person.calculateBmi());}

    //test with negative height value and valid weight
    public void testCalculateBmi10() {
        int weight = -98;
        float height = 174;
        person.setWeight(weight);
        person.setHeight(height);
        String errorMessage = "Error. Values can't be zero.";
        assertEquals(errorMessage, person.calculateBmi());}
    //test with negative height and negative weight

    public void testCalculateBmi11() {
        int weight = -20;
        float height = -135;
        person.setWeight(weight);
        person.setHeight(height);
        String errorMessage = "Error. Values can't be zero.";
        assertEquals(errorMessage, person.calculateBmi());}

    //test with negative weight value and 0 height
    public void testCalculateBmi12() {
        int weight = -52;
        float height = 0;
        person.setWeight(weight);
        person.setHeight(height);
        String errorMessage = "Error. Values can't be zero.";
        assertEquals(errorMessage, person.calculateBmi());}

    //test with 0 weight value and negative height
    public void testCalculateBmi13() {
        int weight = 0;
        float height = -253;
        person.setWeight(weight);
        person.setHeight(height);
        String errorMessage = "Error. Values can't be zero.";
        assertEquals(errorMessage, person.calculateBmi());}

}

