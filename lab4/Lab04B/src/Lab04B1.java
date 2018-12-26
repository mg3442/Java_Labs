/*

Given the total file size in bytes (the size is given as an integer). Time-
run a program that calculates how many kilobytes, megabytes, gigabytes.
 */

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Scanner;
public class Lab04B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sizeByte;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Input information file size in bytes: ");
         sizeByte = scanner.nextInt();
       

      System.out.println(" file size in Kilobytes:" + Logic.sizeKilobyte( sizeByte));
      System.out.println(" file size in Megabytes:" + Logic.sizeMegabyte( sizeByte));
      System.out.println(" file size in Gigabytes:" + Logic.sizeGigabyte( sizeByte));
    }
    
}
