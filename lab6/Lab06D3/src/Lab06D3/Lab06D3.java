/*
 the programm find the maximum digit
for a  natural number
 */
package Lab06D3;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab06D3 {
    
    public static void main(String[] args) {
        
        while (true) {
            long number = UserInput.input("Input a number :");

            View.print("The maximum digit is:  " + CountMaxNumberDigit.maxNumber(number));
           

            if (!Complete.complete("Do you want to continue?")) {
                break;
            }
        }
    }
}
