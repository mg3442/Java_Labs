/*
 * Check if the input number is simple
 */
package Lab06D5;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab06D5 {
    public static void main(String[] args) {
        
        while (true) {
            long number = UserInput.input("Input a number :");

            View.print("It is simple number  " + PrimeNumber.isPrime(number));
           

            if (!Complete.complete("Do you want to continue?")) {
                break;
            }
        }
    }
}
