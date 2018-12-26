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
public class CountDifferentDigits {
    public static int findDifferent(long number) {

        int size = CountNumberDigits.countDigit(number);
        int[] mas = new int[size];

        int quantity = 0;

        for (int i = 0; i < size; i++) {
            mas[i] = (int) number % 10;
            number /= 10;

        }

        for (int i = 0; i < size; i++) {
            for (int k = i + 1; k < size; k++) {
                if (mas[i] == mas[k]) {
                    quantity++;
                    break;
                }

            }
        }

        return size - quantity;
    }
    
}
