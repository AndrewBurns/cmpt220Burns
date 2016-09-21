/**
 * file: lottery.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the lottery abstract data       
 * type.
 */
import java.util.Scanner;

public class lottery {
  public static void main(String[] args) {
    // create a scanner 
    Scanner input = new Scanner(System.in); 
    // generates the 3 random numbers in the lottery
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    int number3 = (int)(Math.random() * 10);
    System.out.println("Three digit lottery"); 
    System.out.println("Enter digit one:");
    int lotteryDigit1 = input.nextInt();
    System.out.println("Enter digit two:");
    int lotteryDigit2 = input.nextInt();
    System.out.println("Enter digit three");
    int lotteryDigit3 = input.nextInt();
    
    int answer = 0;
    
    //checks 
    if (number1 == lotteryDigit1 || number1 == lotteryDigit2 || number1 == lotteryDigit3){
      answer = 3;
    }
    else if (number2 == lotteryDigit1 || number2 == lotteryDigit2 || number2 == lotteryDigit3){
      answer = 3;
    }
     else if (number3 == lotteryDigit1 || number3 == lotteryDigit2 || number3 == lotteryDigit3){
      answer = 3;
    }
    
    //Creates a counter to check if there are a match in numbers in different order
    if(number1 == lotteryDigit2){
      if(number2 == lotteryDigit3){
        if(number3 == lotteryDigit1){
    			answer = 2;
        }
      }
    }
    else if(number1 == lotteryDigit3){
      if(number2 == lotteryDigit1){
        if(number3 == lotteryDigit2){
          answer = 2;
        }
      }
    }
    else if (number2 == lotteryDigit3){
      if (number3 == lotteryDigit1){
    	  if (number1 == lotteryDigit3){	
    	    answer = 2;
        }   
      } 
    }
    
    //Checks if all the numbers are the same in the exact order
    if(number1 == lotteryDigit1 && number2 == lotteryDigit2 && number3 == lotteryDigit3){
    	answer = 1;
    }
   
    switch(answer) {
    case 1:
      System.out.println("You win $10,000");
      break;
    case 2:
      System.out.println("You win $3,000");
      break;
    case 3:
      System.out.println("You win $1,000");
      break;
    default:
      System.out.println("You win no money");
    }
      
  }
}
