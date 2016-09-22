/**
 * file: LargeInteger.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the LargeInteger abstract data       
 * type.
 */
import java.util.Scanner;

public class LargeInteger {
  public static void main(String[] args) {
      
    boolean bool= true;
    int number = 1001;
    double large = 0;
	  
    while (bool == true) {
      large = Math.pow(number, 3);
          
          
      if (large < 12000){
        System.out.println(" the Largest integer is " + number);
        bool = false;
        	  
      }
        number--;
          
    }
	
  }
}