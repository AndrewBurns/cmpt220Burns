/** 
 * file: Duplicate.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 8
 * due date: Nov 3, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Duplicate abstract data       
 * type.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Duplicate {
  public static void main(String[] args){
    
    ArrayList<Integer> list = new ArrayList<>();
    
    ArrayList<Integer> indexList = new ArrayList<>(); 
    Scanner input = new Scanner(System.in);
  
    System.out.print("enter next number");
    for( int i = 0; i < 10; i++){
      list.add(input.nextInt());
    }
    for(int i = 0; i < list.size();i++){
      for(int b = i+1; b < list.size();b++){
        if(list.get(b) == list.get(i)){
          indexList.add(b);
        }
      }
    }
  
    Collections.sort(indexList);
    Collections.reverse(indexList);

    for(int c = 0; c < indexList.size(); c++){
      list.remove(list.get(indexList.get(c)));
    }
    for(int d = 0; d < list.size(); d++){
      System.out.println(list.get(d));
    }
 
 }
}
