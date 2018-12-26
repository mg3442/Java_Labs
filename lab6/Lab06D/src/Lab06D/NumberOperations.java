/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06D;

/**
 *
 * @author Aliaksiej Protas
 */
public class NumberOperations {
     public static int countNumberDigit(long number) {
        int count = 1;
        number = number > 0 ? number : -number;
        while (number > 9) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int countDigitSum(long number) {
        int sum = 0;
        number = number > 0 ? number : -number;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    
}
