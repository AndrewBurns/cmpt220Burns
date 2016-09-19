/**
 * file: ASCII.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the ASCII abstract data       
 * type.
 */
import java.util.Scanner;

public class ASCII {
  public static void main(String[] args) {
	// create a scanner 
	Scanner input = new Scanner(System.in); 
	  	 
    System.out.println("enter an ASCII code between 0-127");
    int number = input.nextInt();
	 	 
	System.out.println((char) number);
	  	
  }
}  