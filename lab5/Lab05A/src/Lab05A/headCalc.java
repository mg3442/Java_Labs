/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05A;

/**
 *
 * @author Aliaksiej Protas
 */
public class headCalc {
     
        
           
       public static  int headCount(int age){
           
            final int firstPeriod = 200;
            final int secondPeriod = 300;
            int numberOfhead = 0;
             if (age >= 0 && age < firstPeriod) {
                numberOfhead = age * 3;
            } else if (age >= firstPeriod && age < secondPeriod) {

            numberOfhead = firstPeriod * 3 + (age - firstPeriod) * 2;
        }
             else if (age >= secondPeriod) {

            numberOfhead = firstPeriod * 3 + (secondPeriod - firstPeriod) * 2 + (age - secondPeriod);
        }

            return numberOfhead;
       }
       public static int eyesCount(int age) {
        return 2 * headCount(age);

    }
}
