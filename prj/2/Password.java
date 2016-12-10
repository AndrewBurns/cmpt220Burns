/**
 * file: Password.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: final project 
 * due date: Dec 13, 2016
 * version: 1.1
 * 
 * My program is a password generator that has 2 separate uses.
 * First my program will test the users password against a set number of tests 
 * once they pass the tests my program will start to give them a new password
 * in the form of a acronym, they will answer questions and the first letter 
 * of each answer will be put into their new password along with randomly
 * generated numbers
 */
// 
import java.util.Scanner;

public class Password { 
  static final int PASSWORD_LENGTH = 13;
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    
    boolean upper = false;
    boolean lower = false;
    int number = 0;
    boolean test = false;

    //while loop is for validating the users password until it passes all tests
    
    while (true) {   
      System.out.print("Enter your password ");
      String pass = input.nextLine();
    
      if (pass.length() < 12) {
        System.out.print("Must be at least 12 characters long press enter  "
           + "to continue ");
        pass = input.nextLine();
      
      } 
      else {
      
        System.out.print("Please enter your first name ");
        String first = input.nextLine();
        System.out.print("Please enter your last name ");
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
            System.out.println("Must contain at least one uppercase  "
                + "character ");
          
        } else if (!lower) {
            System.out.println("Must contain at least one lowercase  "
                + "character ");
          
        } else if (number < 2) {
            System.out.println("Must contain at least two number ");
           //do not allow users to input the most popular password strings
        } else if (pass.contains("password") || (pass.contains("1234")) ||
              (pass.contains("welcome")) || pass.contains("abc")) {
              System.out.println("Your password is too simple! Try again");
        } else if (pass.contains(first) || (pass.contains(last))) {
            System.out.println("Your password contains your name! change "
                + "that please ");
           
        } else {
            System.out.println("Your password passes the initial tests!");
            break;
        }
      }//this section of the code is meant to make a user a new password  
      // I ask a series of questions to make memorizing their password easier
    }
  
    char [] newpass = new char[PASSWORD_LENGTH]; //static final int equal to 13 
    int count = 0;
    double random = (Math.random() * 9 + 1); //getting random # between 1-10 
    String random2 = String.valueOf(random);
       
    System.out.println("What is your favorite color?");  
    String one = input.nextLine();
    char letter1 = one.toUpperCase().charAt(0);
    newpass[count++] = letter1;
    newpass[count++] = random2.toCharArray()[0];
       
    random = (Math.random() * 9 + 1);
    random2 = String.valueOf(random);
       
    System.out.println("What is your home state?");  
    String two = input.nextLine();
    newpass[count++] = two.charAt(0);
    newpass[count++] = random2.toCharArray()[0];
       
    random = (Math.random() * 9 + 1);
    random2 = String.valueOf(random);
       
      
    System.out.println("What was your first car brand?");  
    String three = input.nextLine();
    newpass[count++] = three.charAt(0);
    newpass[count++] = random2.toCharArray()[0];
       
    random = (Math.random() * 9 + 1);
    random2 = String.valueOf(random);
       
       
    System.out.println("What is your favorite animal?");  
    String four = input.nextLine();
    newpass[count++] = four.charAt(0);
    newpass[count++] = random2.toCharArray()[0];
       
    random = (Math.random() * 9 + 1);
    random2 = String.valueOf(random);
       
       
    System.out.println("What is your favorite food?");  
    String five = input.nextLine();
    newpass[count++] = five.charAt(0);
    newpass[count++] = random2.toCharArray()[0];
       
    random = (Math.random() * 9 + 1);
    random2 = String.valueOf(random);
       
       // take input of question into a string 
    // place the first character in the string into array new pass
    System.out.println("What is your mothers hometown?");  
    String six = input.nextLine();
    char letter2 = six.toUpperCase().charAt(0);
    newpass[count++] = letter2;
    newpass[count++] = random2.toCharArray()[0];
       
    random = (Math.random() * 9 + 1);
    random2 = String.valueOf(random);   
       // print out their new password 
    System.out.println(newpass);
    System.out.println("Here is your new password acronym "
        + "comprised of first letter of each of your answers with every"
            + " other value being a randomly generated number. The first"
                + " and last letter in the password are capitalized." );
       

  } 
}