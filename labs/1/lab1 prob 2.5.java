
import java.util.Scanner;

public class finance_app {
  public static void main(String[] args) {
    // create a scanner 
  	Scanner input = new Scanner(System.in);
    
    //retrieve subtotal
    System.out.println("enter a subtotal amount: ");
    double subtotal = input.nextDouble();

    // enter gratuity 
    System.out.println("enter a gratuity rate: ");
    double gratuityRate = input.nextDouble();

    // calculate gratuity
    double gratuity = (gratuityRate / subtotal);

    // calculate total
    double total = (gratuity + subtotal);
  }  
}  