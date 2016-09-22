/**
 * file: SmallInteger.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the SmallInteger abstract data       
 * type.
 */
import java.util.Scanner;

public class SmallInteger {
  public static void main(String[] args) {
     
    boolean bool= true;
    int number = 0;
    double small = 0;
	  
    while (bool == true) {
      small = Math.pow(number, 2);
      number++;
          
      if (small > 12000){
        System.out.println(" the smallest integer is " + number);
        bool = false;
        	  
      }
          
          
    }
	
  }
}