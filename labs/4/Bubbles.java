/**
 * file: Bubbles.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 4
 * due date: Sept 29, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Bubbles abstract data       
 * type.
 */

import java.util.Scanner;

public class Bubbles {
  public static void main(String[] args) {
	  
    double[] myList = new double[10];
	  
    Scanner input = new Scanner(System.in); 
	  
    System.out.println("Enter 10 numbers");
		
    for (int count=0; count < 10; count++) {
      myList[count] = input.nextDouble();
    }

    double[] result = Bubble(myList);

    for(int i = 0; i < result.length; i++){
      System.out.println( result[i]);
    }

  }
  
  
  public static double[] Bubble(double[] array) {
    int incrementor = 0;
    boolean swapped = true;
    while(incrementor < array.length){
      for(int count =1; count < array.length; count++) {
        if(array[count-1] > array[count]){
          double temp = array[count];
          array[count] = array[count - 1];
          array[count - 1] = temp;
        }
		    	
      }
      incrementor++;
    }
	  
    return array;
  }
}
