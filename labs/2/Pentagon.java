/**
 * file: Pentagon.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the Pentagon abstract data       
 * type.
 */
import java.util.Scanner;

public class Pentagon {
  public static void main(String[] args) {
    // create a scanner 
    Scanner input = new Scanner(System.in); 
  	
    System.out.println("enter the length from the center to a vertex");
    double length = input.nextDouble();
  	 
    double Side = 2 * length * Math.sin(Math.PI / 5);
   
    double Area = ((5 * Math.pow(Side, 2)) / (4 * Math.tan(Math.PI / 5)));
  	 
    Area = Math.round(Area);
  	 
    System.out.println("the area of the pentagon is " + Area);
  }
}