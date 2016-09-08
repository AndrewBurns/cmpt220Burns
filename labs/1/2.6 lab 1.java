
import java.util.Scanner;

public class sum_digits {
  public static void main(String[] args) {
    // create a scanner 
  	Scanner input = new Scanner(System.in);

  	//retrieve integer 
  	System.out.println("enter an integer between 0 and 1000: ");
    int number = input.nextInt();

    // create values for each individual int
    int firstDigit = number % 10;
		int remainingNumber = number / 10;
		int secondDigit = remainingNumber % 10;
			remainingNumber = remainingNumber / 10;
		int thirdDigit = remainingNumber % 10;
		int sum = firstDigit + secondDigit + thirdDigit;

		// print out the answer
		System.out.println("The sum of the digits in this integer is.... " + sum);
	}
}
