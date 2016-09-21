/**
 * file: Grade.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 2
 * due date: Spet 14, 2003
 * version: 1.3
 * 
 * This file contains the declaration of the Grade abstract data       
 * type.
 */
import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    // create a scanner 
    Scanner input = new Scanner(System.in);

    // retrieve section grades
    System.out.println("enter percentage (0 – 100%) for your midterm exam: ");
    double midterm = input.nextDouble();
    
    System.out.println("enter percentage (0 – 100%) for your Final exam: ");
    double finalExam = input.nextDouble();

    System.out.println("enter percentage (0 – 100%) for your projects: ");
    double projects = input.nextDouble();

    System.out.println("enter percentage (0 – 100%) for your HW and labs: ");
    double homeworkLabs = input.nextDouble();

    // obtain grades
    double finalGrade = ((midterm * 0.2) + (finalExam * 0.2) + 
        (projects * 0.2) + (homeworkLabs * 0.4));

    if (finalGrade >= 95){
    	System.out.println("A");
    }
    else if (finalGrade < 95 && finalGrade >= 90){
    	System.out.println("A-");
    }
    else if (finalGrade < 90 && finalGrade >= 87){
    	System.out.println("B+");
    }
    else if (finalGrade < 87 && finalGrade >= 83){
    	System.out.println("B");
    }
    else if (finalGrade < 83 && finalGrade >= 80){
    	System.out.println("B-");
    }
    else if (finalGrade < 80 && finalGrade >= 77){
    	System.out.println("C+");
    }
    else if (finalGrade < 77 && finalGrade >= 73){
    	System.out.println("C");
    }
    else if (finalGrade < 73 && finalGrade >= 70){
    	System.out.println("C-");
    }
    else if (finalGrade < 70 && finalGrade >= 65){
    	System.out.println("D");
    }
    else if (finalGrade < 65 && finalGrade >= 0){
    	System.out.println("F");
    }
    
  }
}
