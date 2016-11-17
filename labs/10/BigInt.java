/**
 * file: BigInt.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 10
 * due date: Nov 18, 2016
 * version: 1.1
 * 
 * This file contains the declaration of the LargeInteger abstract data       
 * type.
 */
// 

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter an integer");
    int p = input.nextInt();
    System.out.println(factorial(new BigInteger(p + "")));
  }
    
  public static BigInteger factorial(BigInteger n) {
    if (n.equals(BigInteger.ZERO)) {
      return BigInteger.ONE; 
    }

    return n.multiply(factorial(n.subtract(BigInteger.ONE)));
  }
}