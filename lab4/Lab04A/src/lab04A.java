/*
 * Enter 3 numbers.
 * Check if numbers are different. 
* Check if numbers are positive. 
* Check if All numbers have the same parity. 
* Check if Numbers are triangle sides . 
* Check if Numbers are Righttriangle sides . 
 */

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Scanner;

public class lab04A {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){

            double A ;
	    double B;
	    double C;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number A: ");
           A = scanner.nextDouble();
        System.out.print("Enter number B: ");
           B = scanner.nextDouble();
        System.out.print("Enter number C: ");
           C = scanner.nextDouble();

     System.out.println("Entered numbers are different. This statement is:" + Logic.checkIfDifferent( A, B, C));
     
     System.out.println("Entered numbers are positive. This statement is:" + Logic.checkIfPositiveNumber( A, B, C));

     System.out.println("All numbers have the same parity. This statement is:" + Logic.checkEvenOrOdd( A, B, C));
     
     System.out.println("Numbers are triangle sides . This statement is:" + Logic.checkIfTriangleSides( A, B, C)); 
     
     System.out.println("Numbers are Righttriangle sides . This statement is:" + Logic.checkIfRightTriangle( A, B, C));
   }

    
    
}
