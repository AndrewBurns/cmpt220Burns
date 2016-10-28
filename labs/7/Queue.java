/**
 * file: Queue.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 7
 * due date: Oct 28, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Location abstract data       
 * type.
 */

public class Queue {
  
  public static void main(String[] args) {
    
    Queue queue = new Queue();
    
    for (int i = 0; i <= 20; i++) {
      queue.enqueue(i);
    }

    // dequeue until empty
    while (!queue.isEmpty())
      System.out.print(queue.dequeue() + " ");
    }
 
    private int[] elements;
    private int size;
    private int capacity;
 
    public Queue(int capacity) {
      this.capacity = capacity;
      elements = new int[capacity];
    }
 
    public Queue() {
      elements = new int[8];
    }
 
    public void enqueue(int v) {
      if (size >= elements.length) {
        int[] temp = new int[size * 2];
        System.arraycopy(elements, 0, temp, 0, size);
        elements = temp;
      }
      elements[size++] = v;
 
    }
 
    public int dequeue() {
      int v = elements[0];
      size--;
      for (int a = 0; a < size; a++) {
        elements[a] = elements[a + 1];
      }
      return v;
    }
 
    public boolean isEmpty() {
      return size == 0;
    }
 
    public int getSize() {
      return size;
    }
 
    public int getCapacity() {
      return capacity;
    }
 }
