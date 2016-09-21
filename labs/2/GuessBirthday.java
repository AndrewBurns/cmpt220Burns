/**
 * file: GuessBirthday.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the GuessBirthday abstract data       
 * type.
 */


import java.util.Scanner;

public class GuessBirthday {

  public static void main(String[] args) {

    String set1 = 
      " 1  3  5  7 \n" + " 9 11 13 15 \n" + "17 19 21 23 \n" + "25 27 29 31";

    String set2 = 
      " 2  3  6  7 \n" + "10 11 14 15 \n" + "18 19 22 23 \n" + "26 27 30 31";

    String set3 = 
      " 4  5  6  7 \n" + "12 13 14 15 \n" + "20 21 22 23 \n" + "28 29 30 31";

    String set4 = 
      " 8  9 10 11 \n" + "12 13 14 15 \n" + "24 25 26 26 \n" + "28 29 30 31";

    String set5 = 
      "16 17 18 19 \n" + "20 21 22 23 \n" + "24 25 26 27 \n" + "28 29 30 31";

    int day = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("Is your birthday in set 1?");
    System.out.println(set1);
    System.out.println("Enter 'y' for yes and 'n' for no");
    String answer = input.nextLine();

    if (answer.toLowerCase().equals("y")) 
    day += 1;

    System.out.println("Is your birthday in set 2?");
    System.out.println(set2);
    System.out.println("Enter 'y' for yes and 'n' for no");
    answer = input.nextLine();

    if (answer.toLowerCase().equals("y")) 
    day += 2;

    System.out.println("Is your birthday in set 3?");
    System.out.println(set3);
    System.out.println("Enter 'y' for yes and 'n' for no");
    answer = input.nextLine();

    if (answer.toLowerCase().equals("y")) 
    day += 4;

    System.out.println("Is your birthday in set 4?");
    System.out.println(set4);
    System.out.println("Enter 'y' for yes and 'n' for no");
    answer = input.nextLine();

    if (answer.toLowerCase().equals("y")) 
    day += 8;

    System.out.println("Is your birthday in set 5?");
    System.out.println(set5);
    System.out.println("Enter 'y' for yes and 'n' for no");
    answer = input.nextLine();

    if (answer.toLowerCase().equals("y")) 
    day += 16;

    System.out.println("\nYour birthday is " + day + "!");

  }
}