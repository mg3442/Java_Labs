/*
Program for finding the perimeter and area of a rectangle with sides a and b;
 */

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Scanner;
public class Lab04C1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the a-side length of rectangle: ");
      a = scanner.nextDouble();
      System.out.print("Enter the b-side length of rectangle: ");
      b = scanner.nextDouble(); 

      System.out.println("The rectangle perimeter is: " + RectangleArea.calculatePerimeter(a,b));
      System.out.println("The rectangle area is: " + RectangleArea.calculateArea(a,b));
    }
    
}
