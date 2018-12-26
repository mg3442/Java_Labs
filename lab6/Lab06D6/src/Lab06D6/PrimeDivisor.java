/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06D6;

/**
 *
 *  @author Aliaksiej Protas
 */
public class PrimeDivisor {
    public static void findDivisors(long number) {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                for (int j = 2; j < i; j++) {
                    if (i % j != 0) {
                        System.out.print(i + " ");

                    }
                    break;
                }

            }

        }
    }
}
