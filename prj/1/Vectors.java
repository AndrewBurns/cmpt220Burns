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

    double[] vFirst = new double[firstlength];

    System.out.println("How long is your second vector?");
    int secondlength = input.nextInt();

    double[] vSecond = new double[secondlength];

    System.out.println("Enter " + firstlength + " numbers now.");

    for (int i = 0; i < vFirst.length; i++) {
      vFirst[i] = input.nextDouble();
    }

    System.out.println("Enter " + secondlength + " numbers now.");

    for (int i = 0; i < vSecond.length; i++) {
      vSecond[i] = input.nextDouble();
    }

    int resultLength = (vFirst.length + vSecond.length) - 1;

    double cResult[] = convolve(vFirst, vSecond);
    for (int i = 0; i < resultLength; i++) {
      System.out.print(cResult[i] + " ");
    }
  }
                     // this method convolutes two vectors together
  public static double[] convolve(double[] vFirst,double[] vSecond) {
    // declaring two variables
    int idx = 0;
    int shift = 0;
	 
    int resultLength = (vFirst.length + vSecond.length) - 1;
		
    double[] cResult2 = new double[resultLength];
		
    for (idx = 0; idx < resultLength; idx++) {
      cResult2[idx] = 0;
      for (shift = 0; shift < vSecond.length; shift++) {
        if ((idx - shift >= 0) && (idx - shift < vFirst.length)) {
          cResult2[idx] += vFirst[idx - shift] * vSecond[shift];
        }
      }	
    }
    return cResult2;
		
  }
}