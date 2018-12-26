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
import java.util.Arrays;
public class ArrayWorker {
        public static int findMaxElement(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static int findMinElement(int[] array) {
      
        Arrays.sort(array);
        return array[0];
    }

    public static double findArithmeticMean(int[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static double findGeometricMean(int[] array) {
        double subs = 1;

        for (int i = 0; i < array.length; i++) {
            subs *= array[i];
        }
        if (Math.pow (subs, 1.0 / array.length) > 0){
        return Math.pow(subs, 1.0 / array.length);
        }
        else System.out.print("No decision! A zero element in array!");
        return 0;
    }
        

    public static boolean isRightOrderMinToMax(int[] array) {
        boolean order = true;
       if (array.length == 0 || array.length == 1) {
           order = false;
       }
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]< array[i + 1]) {
                order=false;
                break;
            }
        }
        return order;  
    }
    
    public static boolean isRightOrderMaxToMin(int[] array) {
        boolean order = true;
       if (array.length == 0 || array.length == 1) {
           order = false;
       }
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                 order=false;
                 break;
            }
        }
      return order;
    }

    public static int findFirstMinima(int[] array) {
       
        if (array.length != 0 && array.length != 1) {
            for (int i = 1; i < array.length-1; i++) {
                if (array[i] < array[i + 1] && array[i] < array[i - 1]) {
                                        
                    return i;             
                }   
           }
        }
        return -1;      
    } 
    
    public static int findFirstMaxima(int[] array) {
       
        if (array.length != 0 && array.length != 1) {
            for (int i = 1; i < array.length-1; i++) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                                        
                    return i;             
                }   
           }
        }
        return 11;      
    } 
  
    
    
    public static int[] reverseElement (int[] array) {
        int tmp=0;
        for (int i = 0; i < array.length/2; i++){
            tmp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = tmp;
                    
    }
         return  array;
}

}
