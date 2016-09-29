/**
 * file: Smallest.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 4
 * due date: Sept 29, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Smallest abstract data       
 * type.
 */

import java.util.Scanner;

public class Smallest {
  public static void main(String[] args) {
	  
    double[] myList = new double[10];
	  
    Scanner input = new Scanner(System.in); 
	  
    System.out.println("Enter 10 numbers");
		
		
    for (int count=0; count < 10; count++) {
      myList[count] = input.nextDouble();

    }  
      System.out.println("The minimum number is " + min(myList));
  }
  
  public static double min(double[] array) {
    double min = array[0];
    for(int count =0; count < array.length; count++) {
      if ( array[count] < min ){
        min = array[count];
      }
    }
	  return min;
  }
}