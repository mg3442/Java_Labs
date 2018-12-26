/*
 *Find the greatest common divisor of number
 *and the least common multiple of number
 */
package Lab06D7;

/**
 *
 *  @author Aliaksiej Protas
 */
public class Lab06D7 {
    public static void main(String[] args) {
        
        while (true) {
            long numberfirst = UserInput.input("Input a 1 number :");
            long numbersecond = UserInput.input("Input a 2 number :");

            View.print("This is the greatest common divisor of number:  "
                    +CommonDiviserCommonMultiple.findGCD(numberfirst,numbersecond));
           View.print("This is the least common multiple of number:  "
                    +CommonDiviserCommonMultiple.findLCM(numberfirst,numbersecond));

            if (!Complete.complete("Do you want to continue?")) {
                break;
            }
        }
    }
}
