/**
 * file: Password.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: final project 
 * due date: Dec 13, 2016
 * version: 1.1
 * 
 * This file contains the declaration of the Password abstract data       
 * type.
 */
// 
import java.util.Scanner;

public class Password {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    
    boolean upper = false;
    boolean lower = false;
    int number = 0;
    boolean test = false;
    
  while (true) {
    System.out.print("Enter your password");
    String pass = input.nextLine();
    
    if (pass.length() < 12) {
      System.out.print("must be at least 12 characters long");
      pass = input.nextLine();
      
    } 
    else {
      
      System.out.print("please eneter your first name");
      String first = input.nextLine();
      System.out.print("please eneter your last name");
      String last = input.nextLine();
      
      for (char c : pass.toCharArray()) {
        if (Character.isUpperCase(c)) {
          upper = true;
        } else if (Character.isLowerCase(c)) {
          lower = true;
        } else if (Character.isDigit(c)) {
            number++;   
        }
      }
      if (!upper) {
          System.out.println("must contain at least one uppercase character");
          //pass = input.nextLine();
      } else if (!lower) {
          System.out.println("must contain at least one lowercase character");
          //pass = input.nextLine();
      } else if (number < 2) {
          System.out.println("must contain at least two numbers");
          //pass = input.nextLine();
      } else if (pass.contains("password") || (pass.contains("1234")) ||
            (pass.contains("welcome")) || pass.contains("abc")) {
            System.out.println("your password is too simple! Try again");
      } else if (pass.contains(first) || (pass.contains(last))) {
          System.out.println("your password contains your name! change that");
          //pass = input.nextLine();
      } else {
          System.out.println("your password passes the initial tests!");
          break;
      }
    }
  }
  
       char [] newpass = new char[13];
       int count = 0;
       double random = (Math.random() * 9 + 1);
       String random2 = String.valueOf(random);
       
       System.out.println("what is your favorite color?");  
       String one = input.nextLine();
       char letter1 = one.toUpperCase().charAt(0);
       newpass[count++] = letter1;
       newpass[count++] = random2.toCharArray()[0];
       
       random = (Math.random() * 9 + 1);
       random2 = String.valueOf(random);
       
       System.out.println("what is your home state?");  
       String two = input.nextLine();
       newpass[count++] = two.charAt(0);
       newpass[count++] = random2.toCharArray()[0];
       
       random = (Math.random() * 9 + 1);
       random2 = String.valueOf(random);
       
      
       System.out.println("what was your first car brand?");  
       String three = input.nextLine();
       newpass[count++] = three.charAt(0);
       newpass[count++] = random2.toCharArray()[0];
       
       random = (Math.random() * 9 + 1);
       random2 = String.valueOf(random);
       
       
       System.out.println("what is your favorite animal?");  
       String four = input.nextLine();
       newpass[count++] = four.charAt(0);
       newpass[count++] = random2.toCharArray()[0];
       
       random = (Math.random() * 9 + 1);
       random2 = String.valueOf(random);
       
       
       System.out.println("whats your favorite food?");  
       String five = input.nextLine();
       newpass[count++] = five.charAt(0);
       newpass[count++] = random2.toCharArray()[0];
       
       random = (Math.random() * 9 + 1);
       random2 = String.valueOf(random);
       
       
       System.out.println("what is your mothers hometown?");  
       String six = input.nextLine();
       char letter2 = six.toUpperCase().charAt(0);
       newpass[count++] = letter2;
       newpass[count++] = random2.toCharArray()[0];
       
       random = (Math.random() * 9 + 1);
       random2 = String.valueOf(random);
       
       System.out.println(newpass);
       System.out.println(" here is your new password acronym "
           + "comprised of first letter of each of your answers with every"
               + " other value being a randomly generated number. the first"
               + " and last letter in the password are capitalized" );
       
    
  } 
 }