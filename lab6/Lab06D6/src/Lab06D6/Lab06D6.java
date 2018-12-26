/*
 * Find all the prime divisors of number
 * 
 * 
 */
package Lab06D6;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab06D6 {
    public static void main(String[] args) {
        
        while (true) {
            long number = UserInput.input("Input a number :");

            View.print("This is prime divisors of number  ");
            PrimeDivisor.findDivisors(number);
           

            if (!Complete.complete("Do you want to continue?")) {
                break;
            }
        }
    }
}
