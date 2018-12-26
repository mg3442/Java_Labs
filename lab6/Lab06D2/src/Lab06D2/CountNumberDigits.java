/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06D2;

/**
 *
 * @author Aliaksiej Protas
 */
public class CountNumberDigits {
    public static int countDigit(long number) {
        int count = 1;
        number = number > 0 ? number : -number;
        while (number > 9) {
            count++;
            number /= 10;
        }
        return count;
}
}