/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06A;

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Random;
public class CoinCount {
     static Random rnd = new Random ();
     public static int Heads(int number) {
    

        number = number > 0 ? number : -number;
        int coin;
        int count =0;
        //int tails = number - count;
        for(int i = 0; i<number; i++)
        {
            coin = rnd.nextInt (2);
            if(coin == 0 )count+=1;
        }
        
        return  count;
        
    }
       // public static int Tails(int number) {
       // return  Heads(number);
}
