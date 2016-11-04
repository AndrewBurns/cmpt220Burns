/**
 * file: MyStack.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 8
 * due date: Nov 3, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the MyStack abstract data       
 * type.
 */
import java.util.ArrayList;

public class MyStack {
  
  private ArrayList<Object> list = new ArrayList<>();
  
  
  public boolean isEmpty() {
  return list.isEmpty();
  }
  
  public int getSize(){
    return list.size();
  }
  
  public Object peek() {
    return list.get(getSize() - 1);
  }
  
  public Object pop() {
    Object o = list.get(getSize() - 1);
    return list.remove(getSize() - 1);
  }
  
  public void push(Object o) {
   list.add(o);
  }
  
  @Override
  public String toString() {
    return "stack: " + list.toString();
  }
   
}
