/**
 * file: PlateNumber.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the PlateNumber abstract data       
 * type.
 */
import java.util.Scanner;

public class PlateNumber {
  public static void main(String[] args) {

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	  	
	// generates a random numbers
	int number1 = (int)(Math.random() * 10);
	int number2 = (int)(Math.random() * 10);
	int number3 = (int)(Math.random() * 10);
	int number4 = (int)(Math.random() * 10);
	    
	int letter1 = (int)(Math.random() * 26);
	int letter2 = (int)(Math.random() * 26);
	int letter3 = (int)(Math.random() * 26);
	    
	System.out.print(alphabet.charAt(letter1));
	System.out.print(alphabet.charAt(letter2));
	System.out.print(alphabet.charAt(letter3));
	    
    System.out.print(number1 + "" + number2 + "" + number3 + "" + number4);
  }
}
	    
