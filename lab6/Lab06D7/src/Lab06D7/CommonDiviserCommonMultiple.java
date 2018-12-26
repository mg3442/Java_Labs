/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06D7;

/**
 *
 *  @author Aliaksiej Protas
 */
public class CommonDiviserCommonMultiple {
    public static long findGCD(long number1, long number2) {
        
        while (number1 != number2) {
            if (number1> number2) {
                number1-= number2;
            } else {
                number2 -= number1;
            }
        }
      
        return number2;
    }
    
    public static long findLCM(long number1, long number2) {
        long startNumber1 = number1;
       long startNumber2 = number2;
        
        while (number1 != number2) {
            if (number1 > number2) {
               number1 -= number2;
            } else {
                number2 -= number1;
            }
        }
         
        
       return (startNumber1 * startNumber2)/number1;
    }
}
