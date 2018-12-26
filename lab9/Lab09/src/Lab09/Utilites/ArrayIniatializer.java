/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab09.Utilites;

import java.util.Random;

/**
 *
 * @author Aliaksiej Protas
 */
public class ArrayIniatializer {
    public static void rndInit(int[][] array, int min, int max, int row, int column) {
        Random random = new Random();
        for (int j = 0; j < row; j++) {
            for (int i = 0; i < column; i++) {
                array[j][i] = random.nextInt(max - min + 1) + min;              
            }  
        }
    }
}
