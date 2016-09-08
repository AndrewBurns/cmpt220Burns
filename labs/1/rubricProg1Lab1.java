
import java.util.Scanner;

public class grade_calc_program {
  public static void main(String[] args) {
    // create a scanner 
  	Scanner input = new Scanner(System.in);

  	// retrieve section grades
    System.out.println("enter a percentage (0 – 100%) for your midterm exam: ");
    double midterm = input.nextDouble();
    
    System.out.println("enter a percentage (0 – 100%) for your Final exam: ");
    double finalExam = input.nextDouble();

    System.out.println("enter a percentage (0 – 100%) for your projects: ");
    double projects = input.nextDouble();

    System.out.println("enter a percentage (0 – 100%) for your HW and labs: ");
    double homeworkLabs = input.nextDouble();

    // obtain grades
    double finalGrade = ((midterm * 0.2) + (finalExam * 0.2) + (projects * 0.2) + (homeworkLabs * 0.4));

   	System.out.println(finalGrade);

    }
}
