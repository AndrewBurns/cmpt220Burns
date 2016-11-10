/**
 * file: Bounds.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 9
 * due date: Nov 10, 2016
 * version: 1.1
 * 
 * This file contains the declaration of the LargeInteger abstract data       
 * type.
 */
// check to see if index entered is out of bounds, or return # index

import java.util.Scanner;

public class Bounds {
  public static void main(String[] args) {
    int i;
    int[] myArray = new int[100];
    for (i = 0; i < myArray.length; i++) {
      myArray[i] = (int) (Math.random() * 100);

    }
    try {
      Scanner input = new Scanner(System.in);
      System.out.println("please eneter a number ");
      int index = input.nextInt();
      System.out.print(myArray[index]);
    } 
    catch (IndexOutOfBoundsException ex) {
      System.out.print("out of bounds");
    }
  }
}