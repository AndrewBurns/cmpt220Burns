
import java.util.Scanner;

public class celsius2Fahrenheit {
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);

  	System.out.println("enter a degree in celsius: ");
  	double celsius = input.nextDouble();

    // convert celsius to fahrenheit 
    double Fahrenheit = (9.0 / 5) * (celsius + 32);
    System.out.println("celsius " + celsius + "is " + Fahrenheit + 
    	" in fahrenheit");
  }
}

   