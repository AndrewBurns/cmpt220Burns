/**
 * file: Max.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 7
 * due date: Oct 28, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Location abstract data       
 * type.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Max {
  public static void main(String[] args) {
    String temp = Long.toString((long)Math.floor(Math.sqrt(Long.MAX_VALUE)));
    String maxAsString = Long.toString(Long.MAX_VALUE);

    
    BigInteger maxValue = new BigInteger(maxAsString);
    BigInteger Square = new BigInteger(temp);
    
    int count = 0;
    
    while(count < 10){
      if(Square.multiply(Square).compareTo(maxValue) == 1){
        System.out.println(Square.multiply(Square));
        count++;
      }
      Square = Square.add(new BigInteger("1"));
    }
  }
}