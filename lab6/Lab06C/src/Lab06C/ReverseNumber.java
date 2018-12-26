/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06C;

/**
 *
 * @author Aliaksiej Protas
 */
public class ReverseNumber {
    public static int findReverse(int number) {
        number = number > 0 ? number : -number;
        int reverse = 0;
        while (number != 0) {
            reverse = ( reverse * 10)+( number%10 );
            number /= 10;

        }
        return reverse;
    }
    
}
