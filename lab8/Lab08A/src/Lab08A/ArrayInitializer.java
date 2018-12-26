/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab08A;

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Random;
public class ArrayInitializer {
      public static void rndInit(int[] array, int min, int max) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }
      

    public static void userInit(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = UserInput.input("[" + (i + 1) + "]: ");
        }
    }
}
