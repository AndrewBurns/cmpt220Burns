/**
 * file: Rectangle.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 6
 * due date: Oct 20, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the Rectangle abstract data       
 * type.
 */

import java.util.Scanner;

public class Rectangle {
  // main method
  // create 2 double fields height and weight default 1

  double length = 1;
  double width = 1;

  public static void main(String[] args) {
    // create a rectangle with defaults
    Rectangle Rectangle1 = new Rectangle();
    System.out.println("the area of the rectangle of width " + Rectangle1.width + " and length of "
        + Rectangle1.length + " is " + Rectangle1.getArea());
    System.out.println("the perimeter of the rectangle of width " + Rectangle1.width + " and length of "
        + Rectangle1.length + " is " + Rectangle1.getPerimeter());
    }

    // no args constuctor that creates a default rectangle
    Rectangle() {

    }

    // a constructor that creates a rect with the specified width and height
    Rectangle(int width, int length) {
    // Get user input
    this.length = length;
    this.width = width;
    }

    // method that returns the area of rec
    double getArea() {
      return this.length * this.width;
    }

    // method that returns the perimeter
    double getPerimeter() {
      return (2 * (this.length * this.width));
    }
}
