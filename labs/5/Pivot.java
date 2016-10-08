/**
 * file: Pivot.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 5
 * due date: Oct 7, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Pivot abstract data       
 * type.
 */


import java.util.Scanner;


public class Pivot{
  public static void main (String[] args) {

    // Enter values for list1
    Scanner input = new Scanner(System.in); 
	  
    System.out.print("Enter a list: ");
    int ListLength = input.nextInt();
    int[] list = new int[ListLength];   
    
    
    for (int i = 0; i < list.length; i++) 
      list[i] = input.nextInt();

    partition(list);
    
    System.out.print("After the partition, the list is ");
    for (int a = 0; a < list.length; a++)
      System.out.print(list[a] + " ");
  }

 
  public static int partition(int[] list) {
  	int start = 0;
  	int last = list.length - 1;
    int pivot = list[start]; 
    int lowCount = start + 1; 
    int highCount = last; 

    while (highCount > lowCount) {
    	
      // move low counter
      while (lowCount <= highCount && list[lowCount] <= pivot)
        lowCount++;

       
      while (lowCount <= highCount && list[highCount] > pivot)
        highCount--;

      // swap H&L numbers once hC is greater 
      if (highCount > lowCount) {
        int temp = list[highCount];
        list[highCount] = list[lowCount];
        list[lowCount] = temp;
      }
    }

    while (highCount > start && list[highCount] >= pivot)
      highCount--;

    // Swap pivot number 
    if (pivot > list[highCount]) {
      list[start] = list[highCount];
      list[highCount] = pivot;
      return highCount;
    }
    else {
      return start;
    }
  }
}