/**
 * file: FutureTuition.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the FutureTuition abstract data       
 * type.
 */
import java.util.Scanner;

public class FutureTuition {
  public static void main(String[] args) {
    // create a scanner 
    Scanner input = new Scanner(System.in); 
    
    //first year tuition 
    double t = 10000;  
    		
    int count = 1;
    double year1 = 0;
    double year2 = 0;
    double year3 = 0;
    double year4 = 0;
    double total;
    
    do{
      System.out.println("Count is: " + count);
      t = ((t * .05) + t); 
        count++;
    }while(count < 10);
    System.out.println("the tuition in ten years will be " + t);
    
    do{
      System.out.println("Count is: " + count);
      t = ((t * .05) + t);
      if (count == 10){
        year1 = t;
      }
      if (count == 11){
        year2 = t;
      }
      if (count == 12){
        year3 = t;
      }
      if (count == 13){
        year4 = t;
      }
        count++;
      }while(count < 14);
	
      total = year1 + year2 + year3 + year4;
      
      System.out.println("The total cost of four years worth of tuition after"
          + " the tenth year is " + total);
	
  }
}