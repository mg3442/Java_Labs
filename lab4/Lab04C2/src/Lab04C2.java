/*
 * There are 2 circles with a common center and radius R1 and R2 (R1>R2). 
*Develop a program for finding the area of a ring whose outer radius R1, and the inner radius R2
 */

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Scanner;
public class Lab04C2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
double r1,r2;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the 1-st radius: ");
      r1 = scanner.nextDouble();
      System.out.print("Enter the 2-nd radius: ");
      r2 = scanner.nextDouble(); 
      if (r2>=r1)
      System.out.println("2-d radius cant be more or the same as the first! : ");
      else
      System.out.println("The rectangle area is: " + RingArea.findArea(r1,r2));
    }
    
}
