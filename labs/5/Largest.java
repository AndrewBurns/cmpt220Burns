/**
 * file: Largest.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 5
 * due date: Oct 7, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Largest abstract data       
 * type.
 */


import java.util.Scanner;
public class Largest{
  public static void main(String[] args){
    //Create Scanner
    Scanner input = new Scanner(System.in);
               
               
    System.out.print("Enter the number of rows and columns in the array: ");
    int row = input.nextInt();
    int col = input.nextInt();
    System.out.println("Enter numbers into array: ");
    double[][] matrix = new double[row][col];
               
    for( row = 0; row < matrix.length; row++) {
      for(col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = input.nextInt();
      }
    }
             
    int[] largest = locateLargest(matrix);
    System.out.println("The location of the largest element is at 
        (" + largest[0] + ", " + largest[1] + ")");
               
  }
  //finds largest number within a multi array
  public static int[] locateLargest(double[][] a ){
    int[] largest = {0, 0};
    double big = a[0][0];

    // what comes after my for statements
    for (int row = 0; row < a.length; row++) {
      for (int col = 0; col < a[row].length; col++) {
        if (big < a[row][col]) {
          largest[0] = row;
          largest[1] = col;
          big = a[row][col];
        }
      }
    }
    return largest;
  } 
}