
/**
 * file: Test.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 8
 * due date: nov 3, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Test abstract data       
 * type.
 */
import java.util.Scanner;

public class Test {
  
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    
    MyStack stack = new MyStack();
  
    for( int i = 0; i<5; i++){
      System.out.print("enter next number");
      stack.push(input.next());
    }
    for( int i = 0; i<5; i++){
      System.out.print(stack.pop() + " ");
      
    }
   
   
  }
 }