/**
 * file: ThreeIntegers.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the ThreeIntegers abstract data     
 * type.
 */
import java.util.Scanner;

public class ThreeIntegers {
  public static void main(String[] args) {
    // create a scanner 
    Scanner input = new Scanner(System.in);

    System.out.println("enter an integer value for number 1");
    int number1 = input.nextInt(); 

    System.out.println("enter an integer value for number 2");
    int number2 = input.nextInt(); 

    System.out.println("enter an integer value for number 3");
    int number3 = input.nextInt(); 
    // creates an order for the integers so the highest value is in number1 lowest in number2 etc.

    // if number 3 is greater than number2 then swap number2 with number3  
    if (number2 < number3){
     int temp = number2;
     number2 = number3;
     number3 = temp;
    }

    // if number 2 is greater than number1 then swap number1 with number2 
    if (number1 < number2){
     int temp = number1;
     number1 = number2;
     number2 = temp;
    }

    // if number 3 is greater than number2 then swap number2 with number3  
    if (number2 < number3){
     int temp = number2;
     number2 = number3;
     number3 = temp;
    }

 
    System.out.println(number1);
    System.out.println(number2);
    System.out.println(number3);
  }
}