/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06D5;

/**
 *
 * @author Aliaksiej Protas
 */
public class PrimeNumber {
     public static boolean isPrime(long number) {
        boolean answer = false;

        int sum = 0;
        
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum <= 1) {
            answer = true;
        }

        return answer;
    }
}
