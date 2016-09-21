/**
 * file: ComputeChange.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the ComputeChange abstract data       
 * type.
 */
import java.util.Scanner;

public class ComputeChange {
  public static void main(String[] args) {
    // create a scanner 
    Scanner input = new Scanner(System.in); 
	  	 
    System.out.println("enter an amount in double, for example 11.56: ");
    String amount = input.nextLine();
    
    //Double.toString(amount);
    
    
    int k = amount.indexOf(".");
    String Dollars = amount.substring(0, k);
    String Cents = amount.substring(k + 1);
    System.out.println("the dollar amount is " + Dollars + " dollars");
    System.out.println("the amount of change is " + Cents + " cents");
  
  }  
}    
    
