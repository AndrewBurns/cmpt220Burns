/**
 * file: AvgNumber.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the AvgNumber abstract data       
 * type.
 */
import java.util.Scanner;

public class AvgNumber {
  public static void main(String[] args) {
    // create a scanner 
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter an integer, the input ends if it is 0: ");
    
    int p = input.nextInt();
    //number of positive numbers
    int np = 0;
    // number of negative numbers
    int nn = 0;
    // sum of all the numbers
    double sumn = 0;
    //average of all numbers
    double avgn = 0;
    
    if (p == 0)
      return;
    
    do{
      if (p>0)
        np++;
      else
        nn++;
      sumn += p;
      p = input.nextInt();  
    } while ( p != 0);
	
    avgn = sumn / ((double)(np + nn));
	
    System.out.println("the number of positives is " + np);
    System.out.println("the number of negatives is " + nn);
    System.out.println("the total is " + sumn);
    System.out.println("the average is " + avgn);
  }
} 