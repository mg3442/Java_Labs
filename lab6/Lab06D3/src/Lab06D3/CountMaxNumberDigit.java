/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06D3;

/**
 *
 * @author Aliaksiej Protas
 */
public class CountMaxNumberDigit {
    public static long maxNumber(long number) {
        
        number = number > 0 ? number : -number;
        long max = 0;
        while (number > 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
            number /= 10;
        }

        return max;
    }
    
}
