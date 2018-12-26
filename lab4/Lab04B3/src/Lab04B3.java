/*

Program that reverses a 4-th digit number N;
 */

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Scanner;
public class Lab04B3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sourceNumber;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a 4-th grade number: ");
        sourceNumber = scanner.nextInt();
       

      System.out.println("Reverced number:" + ReverceNumber.getReverceNumber(sourceNumber));
      

   }
    }
    

