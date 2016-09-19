/**
 * file: DateMonth.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the DateMonth abstract data       
 * type.
 */

import java.util.Scanner;

public class DateMonth {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); 

	System.out.println("enter the Month number");
	int Month = input.nextInt(); 

	System.out.println("enter the year");
	int Year = input.nextInt(); 


	switch (Month){
	case 1: System.out.println("January has 31 days in " + Year); break;
    case 2: System.out.println("Febuary has 28 days in " + Year); break;
	case 3: System.out.println("March has 31 days in " + Year); break;
	case 4: System.out.println("April has 30 days in " + Year); break;
	case 5: System.out.println("May has 31 days in " + Year); break;
	case 6: System.out.println("June has 30 days in " + Year); break;
	case 7: System.out.println("July has 31 days in " + Year); break;
	case 8: System.out.println("August has 31 days in " + Year); break;
	case 9: System.out.println("September has 30 days in " + Year); break;
	case 10: System.out.println("October has 31 days in " + Year); break;
	case 11: System.out.println("November has 30 days in " + Year); break;
	case 12: System.out.println("December has 31 days in " + Year); break;
	
	}
  }
}
