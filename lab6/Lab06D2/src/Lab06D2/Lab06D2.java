/*
 the programm find the number of different digits
for a natural number
 */
package Lab06D2;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab06D2 {
    public static void main(String[] args) {
        
        while (true) {
            long number = UserInput.input("Input a number :");

            View.print("The number of digits is:  " + CountNumberDigits.countDigit(number));
            View.print("The number of different digits is:  " + CountDifferentDigits.findDifferent(number));

            if (!Complete.complete("Do you want to continue?")) {
                break;
            }
        }
    }
    
}
