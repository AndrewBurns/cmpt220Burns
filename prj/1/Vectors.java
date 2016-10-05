/**
 * file: Vectors.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: prj 2
 * due date: oct 4, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Vectors data type       
 * type.
 */

import java.util.Scanner;


public class Vectors {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("How long is your first vector?");
    int firstlength = input.nextInt();

    int[] vFirst = new int[firstlength];

    System.out.println("How long is your second vector?");
    int secondlength = input.nextInt();

    int[] vSecond = new int[secondlength];

    System.out.println("Enter " + firstlength + " numbers now.");

    for (int i = 0; i < vFirst.length; i++) {
      vFirst[i] = input.nextInt();
    }

    System.out.println("Enter " + secondlength + " numbers now.");

    for (int i = 0; i < vSecond.length; i++) {
      vSecond[i] = input.nextInt();
    }

    int idx = 0;
    int shift = 0;

    int resultLength = (vFirst.length + vSecond.length) - 1;

    int cResult[] = new int[resultLength];
    for (int i = 0; i < resultLength; i++) {
      cResult[i] = 0;
    }
		


    for (idx = 0; idx < resultLength; idx++) {
      for (shift = 0; shift < vFirst.length; shift++) {
        if ((idx - shift) < 0 || (idx-shift) > vFirst.length - 1 ) {
          cResult[idx] += 0;
        } 
        else {
          cResult[idx] += vFirst[idx-shift] * vSecond[shift];
        }
      }	
    }
    System.out.print(cResult[0]);
    System.out.print(cResult[1]);
    System.out.print(cResult[2]);
    System.out.print(cResult[3]);
    System.out.print(cResult[4]);

  }
}