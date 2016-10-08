
/**
 * file: Merge.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 5
 * due date: Oct 7, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Merge abstract data       
 * type.
 */


import java.util.Scanner;

public class Merge {
	
  public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in); 
		
    System.out.println("Enter list 1 length:");
    int length1 = input.nextInt();
		
    System.out.println("Enter list 2 length:");
    int length2 = input.nextInt();
		
    int[] list1 = new int[length1];
    int[] list2 = new int[length2]; 
		  
    System.out.println("Enter list1: ");
			
			
    for (int count=0; count < list1.length; count++) {
      list1[count] = input.nextInt();
    }
			 
    System.out.println("Enter list2: ");
				
				
    for (int count=0; count < list2.length; count++) {
      list2[count] = input.nextInt();
    }	 
    int[] result = Merge(list1, list2);

    for(int i=0; i< result.length; i++){
    System.out.print(result[i] + " ");
    }
  }
  // the method for sorting numbers
  public static int[] Merge(int[] list1, int[] list2) {
    int totalLength = list1.length + list2.length;
    int array1Count = 0;
    int array2Count = 0;
    int resultArrayCount = 0;
    int[] result = new int [totalLength];
    while(array1Count < list1.length && array2Count < list2.length){
      if(list1[array1Count] > list2[array2Count]){
        result[resultArrayCount] = list2[array2Count];
        array2Count++;
      }
      else{
        result[resultArrayCount] = list1[array1Count];
        array1Count++;	  
      }	  
      resultArrayCount++;
    }
    while(array1Count < list1.length){
      result[resultArrayCount] = list1[array1Count];
      array1Count++;
      resultArrayCount++;
    }
    while(array2Count < list2.length){
      result[resultArrayCount] = list2[array2Count];
      array2Count++;
      resultArrayCount++;
    }
    return result;
  }
}