/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06D4;

/**
 *
 * @author Aliaksiej Protas
 */
public class PalindromeNumber {
   public static boolean isPalindrom(long number) {
        number = number > 0 ? number : -number;
        boolean answer = false;
        long[] a = new long[19];
        int count = 0;

        while (number > 0) {

            a[count] = number % 10;
            count++;
            number /= 10;
        }

        for (int i = 0; i < count / 2; i++) {
            if (a[i] == a[count - 1 - i]) {
                answer = true;
                break;
            }
        }

        return answer;
}
}
