/*
 * Develop a program for calculating the distance traveled by a boat that 
 * moved initially along the river T1 h, and then against the current T2 h. 
 * Speed of a boat in standing water V km / h, the speed of the river U km / h
 */

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Scanner;
public class Lab04C3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter time boat go with the flow(hours): ");
      double timeWithFlow = scanner.nextDouble();
      System.out.print("Enter time boat go against the flow(hours): ");
      double timeAgainstFlow = scanner.nextDouble();
      System.out.print("Enter boat speed (km per hour): ");
      double boatSpeed = scanner.nextDouble(); 

        System.out.print("Enter river speed (km per hour): ");
      double riverSpeed = scanner.nextDouble();
      
      System.out.println("The distance is: " + BoatDistance.findDistance
        (timeWithFlow,timeAgainstFlow,boatSpeed,riverSpeed)+"km");
    }
    
}
