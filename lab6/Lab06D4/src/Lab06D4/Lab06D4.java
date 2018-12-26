/*
 * Check if input number is palindrom
 */
package Lab06D4;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab06D4 {
    public static void main(String[] args) {
        
        while (true) {
            long number = UserInput.input("Input a number :");

            View.print("Is it palindrome?:  " + PalindromeNumber.isPalindrom(number));
           

            if (!Complete.complete("Do you want to continue?")) {
                break;
            }
        }
    }
}
