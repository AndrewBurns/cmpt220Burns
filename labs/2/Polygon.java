/**
 * file: Polygon.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the Polygon abstract data       
 * type.
 */
import java.util.Scanner;

public class Polygon {
  public static void main(String[] args) {
  	// create a scanner 
  	Scanner input = new Scanner(System.in); 
  	
  	System.out.println("enter the number of sides");
 	 double n = input.nextDouble();
 	 
 	System.out.println("enter the length of the side");
 	 double s = input.nextDouble();
 	 
 	 double Area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
 	 
 	System.out.println("The area of the polygon is " + Area);
  } 	 
}
