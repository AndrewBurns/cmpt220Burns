/**
 * file: Letters.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 4
 * due date: Sept 29, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Letters abstract data       
 * type.
 */
import java.util.Scanner;

public class Letters {
  public static void main(String[] args) {
	  
    // create a scanner 
    Scanner input = new Scanner(System.in); 
		  
    System.out.println("Enter a string of characters ");
    String s = input.next();
    System.out.println(countLetters(s));
	  
	  
  }
	  
  public static int countLetters(String s) {
    return s.length( );
    
  }
}