/**
 * file: RandomMath.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the RandomMath abstract data
 * type.
 */
import java.util.Scanner;

public class RandomMonth {
  public static void main(String[] args) {
    // generates a random number 
    int number1 = (int)(Math.random() * 12);

    if (number1 == 1)
      System.out.println("January");
    else if (number1 == 2)
      System.out.println("Feburary");
    else if (number1 == 3)
      System.out.println("March");
    else if (number1 == 4)
      System.out.println("April");
    else if (number1 == 5)
      System.out.println("May");
    else if (number1 == 6)
      System.out.println("June");
    else if (number1 == 7)
      System.out.println("July");
    else if (number1 == 8)
      System.out.println("August");
    else if (number1 == 9)
      System.out.println("September");
    else if (number1 == 10)
      System.out.println("October");
    else if (number1 == 11)
      System.out.println("November");
    else if (number1 == 12)
      System.out.println("December");
  }
}
  	