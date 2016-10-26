/**
 * file: Location.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 6
 * due date: Oct 20, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Location abstract data       
 * type.
 */


import java.util.Scanner;


public class Location{
  //main method
  public int row = 0;
  public int column = 0;
  public double maxValues = 0;

  public static void main (String[] args) {
  
    System.out.print("Enter the number of rows and columns in the array: ");
    Scanner input = new Scanner(System.in);
    int row = input.nextInt();
    int column = input.nextInt();
    System.out.println("Enter numbers into the array: ");
    double[][] matrix = new double[row][column];
      
    for( row = 0; row < matrix.length; row++) {
   	  for( column = 0; column < matrix[row].length; column++) {
   		  matrix[row][column] = input.nextDouble();
   	  }
    }
	  
    Location newLoc = locateLargest(matrix);
      
    System.out.println("The location of the largest element is "
        + newLoc.maxValues + " at " + ( (newLoc.row + "," +  newLoc.column)));
  }
  public static Location locateLargest(double[][] a){
    int[] largest = {0, 0};
	  
    Location largestLoc = new Location();
	  
    largestLoc.maxValues = a[0][0];

    // what comes after my for statements
    for (int row1 = 0; row1 < a.length; row1++) {
      for (int col = 0; col < a[row1].length; col++) {
        if (largestLoc.maxValues < a[row1][col]) {
          largestLoc.maxValues = a[row1][col];
          largestLoc.row = row1;
          largestLoc.column = col;
        }
      }
    }
    return largestLoc;
  }  
}
