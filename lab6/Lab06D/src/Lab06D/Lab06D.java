/*
 * a program that calculates the sum and the 
number of digits for a given natural number.
 */
package Lab06D;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab06D {
    public static void main(String[] args) {
        
        while (true) {
            long number = UserInput.input("Input a number :");

            View.print("The number of digits is:  " + NumberOperations.countNumberDigit(number));
            View.print("The sum of digit is:  " + NumberOperations.countDigitSum(number));

            if (!Complete.complete("Do you want to continue?")) {
                break;
            }
        }
    }
}
