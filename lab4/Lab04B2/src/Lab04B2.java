/*
 Programm calculate dragon's weight in kilogramm, centners and e.c. Source  info - weight in gramm
 */

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Scanner;
public class Lab04B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       long weightGrams;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter dragon's weight in gramms: ");
        weightGrams = scanner.nextInt();
       

      System.out.println("dragon's weight in kilograms:" + WeightCalculator.calculateKilogram( weightGrams));
      System.out.println("dragon's weight in centners:" + WeightCalculator.calculateCentner( weightGrams));
      System.out.println("dragon's weight in tons:" + WeightCalculator.calculateTon( weightGrams));

   }
    }
    

