/**
 * file: KeyPad.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the KeyPad abstract data       
 * type.
 */
import java.util.Scanner;

public class KeyPad {
  public static void main(String[] args) {
    // create a scanner 
    Scanner input = new Scanner(System.in); 
	  	 
    System.out.println("enter a letter");
    String letter = input.nextLine();
	 	 
    letter = letter.toLowerCase();
    
    if (letter.equals("a") || letter.equals("b") || letter.equals("c")) {
        
    System.out.println("2");
    }

    else if(letter.equals("d") || letter.equals("e") || letter.equals("f")) {
      System.out.println("3");
    }

    else if (letter.equals("g") || letter.equals("h") || letter.equals("i")) {
      System.out.println("4");   
    }
    else if (letter.equals("j") || letter.equals("k") || letter.equals("l")) {
      System.out.println("5");    
    }
    else if (letter.equals("m") || letter.equals("n") || letter.equals("o")) {
      System.out.println("6");    
    }    
    else if (letter.equals("p") || letter.equals("q") || letter.equals("r") || 
        letter.equals("s")) {
      System.out.println("7");    
    }    
    else if (letter.equals("t") || letter.equals("u") || letter.equals("v")) {
      System.out.println("8");    
    }    
    else if (letter.equals("W") || letter.equals("X") || letter.equals("Y") || 
        letter.equals("z")) {
      System.out.println("9");    
    }  
    else
    {
      System.out.println("is an invalid input");
    }
  } 	
}