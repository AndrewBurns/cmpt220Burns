/**
 * file: celcius.java
 * author: Drew Burns
 * course: CMPT 220
 * assignment: Lab 4
 * due date: Sept 29, 2016
 * version: 1.3
 * 
 * This file contains the declaration of the celsius abstract data       
 * type.
 */
public class celsius {
  public static void main(String[] args) {
      
    System.out.format("   Celcius  Farenheit |  Farenheit    Celsius\n");
    for (double cel=40.0, far=120; cel>30.0; cel-=1, far-=10) {
      System.out.format("%10.1f %10.1f | %10.1f %10.1f \n", 
            cel, Cel2Far(cel), far, Far2Cel(far));
    }
  }
  public static double Cel2Far(double cel) {
    return (9.0)/5.0 * (cel +32.0);			  
  }
  
  public static double Far2Cel(double far) {
    return (5.0/9.0) * (far - 32.0);
  }
}
