/**
 * file: Selection.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 5
 * due date: OCT 7, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Selection abstract data       
 * type.
 */

import java.util.Scanner;

public class Selection {
	
  public static void main(String[] args) {
		  
    double[] List = new double[10];
		  
    Scanner input = new Scanner(System.in); 
		  
    System.out.println("Enter 10 numbers");
			
			
    for (int count=0; count < 10; count++) {
      List[count] = input.nextDouble();
    }
    double[] result = Selection(List);
    for( int i = 0; i < result.length; i++){
      System.out.println(result[i]);
    }
  }
  // the method for sorting numbers
  public static double[] Selection(double[] List) {
    for(int i = 0; i < List.length - 1; i++) {
      //find the maximum in the list
      double currentMax = List[i];
      int currentMaxIndex = i;
		  
      for(int j = i + 1; j < List.length; j++) {
        if (currentMax < List[j]){
          currentMax = List[j];
          currentMaxIndex = j;
        }
      }

      // swap list [i] with list[currentMaxIndex] if necessary
      if( currentMaxIndex != i) {
        List[currentMaxIndex] = List[i];
        List[i] = currentMax;
      }
    }
    return List;
  }
}