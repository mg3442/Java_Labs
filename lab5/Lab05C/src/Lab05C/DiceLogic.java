/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05C;

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Random;
public class DiceLogic {
      public static int sides = 6;
      public static int throw1() {

        Random rand = new Random();

        int result1 = rand.nextInt(sides) + 1;

        return result1;
    }

    public static int throw2() {

        Random rand = new Random();

        int result2 = rand.nextInt(sides) + 1;

        return result2;
    }

    
}
