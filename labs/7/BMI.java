/**
 * file: BMI.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 7
 * due date: Oct 28, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the BMI abstract data       
 * type.
 */

  public class BMI {
    public static void main(String[] args) {
    BMI bmi1 = new BMI("Sami Elougani", 19, 150, 5, 11);
    System.out.println("The BMI for " + bmi1.getName() + " is "
        + bmi1.getBMI() + " " + bmi1.getStatus());
    }
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches
    public final double KILOGRAMS_PER_POUND = 0.45359237; 
    public final double METERS_PER_INCH = 0.0254;  
      
     
    public BMI(String name, int age, double weight, double feet, double inches) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = feet * 12 + inches;
    }

    public BMI(String name, int age, double weight, double height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
    }
      
    public BMI(String name, double weight, double height) {
      this(name, 20, weight, height);
    }
      
    public double getBMI() {
      double bmi = weight * KILOGRAMS_PER_POUND / 
      ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
      return Math.round(bmi * 100) / 100.0;
    }
      
    public String getStatus() {
      double bmi = getBMI();
      if (bmi < 16)
        return "seriously underweight";
      else if (bmi < 18.5)
        return "underweight";
      else if (bmi < 25)
        return "normal";
      else if (bmi < 30)
        return "overweight";
      else 
        return "obese";
    }
      
    public String getName() {
      return name;
    }
      
    public int getAge() {
      return age;
    }
      
    public double getWeight() {
      return weight;
    }
      
    public double getHeight() {
      return height;
    }
  }