/**
 * file: Palindrome.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the Palindrome abstract data       
 * type.
 */
import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    // create a scanner 
    Scanner input = new Scanner(System.in); 
    
    System.out.println("Enter a three digit number:");
    int number = input.nextInt();
    System.out.println(Reverse(number));
    System.out.println(isPalindrome(number));
	}
	  
  //return the reversal of an integer 
  public static int Reverse(int number) {
    int result = 0;
    int digit = 0;
    while (number > 0) {
      digit = number % 10;
      number = number / 10;
      result = (result * 10) + digit;    
    }
    
    return result;
      
  }  
  
  
  //return true if it is a palindrome
  public static boolean isPalindrome(int number) {

    return Reverse(number) == number;
		  
  }
  
}