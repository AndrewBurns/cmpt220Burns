/**
 * file: SumDigits.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the SumDigits abstract data       
 * type.
 */
import java.util.Scanner;

public class SumDigits {
  public static void main(String[] args) {
	  
	  
    // create a scanner 
    Scanner input = new Scanner(System.in); 
	  
    System.out.println("Enter a three digit number:");
    int number = input.nextInt();
    System.out.println(SumDigits(number)); 
	  
  } 
  public static int SumDigits(long n) {
	  
    int result = 0;
    int digit = 0;
    while (n > 0) {
      digit = (int) (n % 10);
      n = n / 10;
      result = result + digit;    
	}
	    
    return result;
	      
  }  
	  
}   