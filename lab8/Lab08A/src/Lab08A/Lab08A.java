/*
A one-dimensional array of size N is specified. You must perform the following
actions:
1. find extremes (minimum and maximum elements)
given one-dimensional array;
2.Find the arithmetic mean and geometric mean values ​​of all
 array elements;
3. check whether all the elements of the array are in an ordered form (i.e.
whether the elements are sorted in ascending or descending order within the
array);
4. find the position of the first encountered local minimum (maxi
mum), and if there are no such elements, then return -1 (the local minimum is
it is an element that is smaller than any of its neighbors; local maxi
Mum is an element that is larger than any of its neighbors);
5. reverse the elements of the array (when solving this task, it is not recommended
 to use additional memory).
 */
package Lab08A;

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Arrays;
public class Lab08A {
    public static void main(String[] args) {
    
        int size = UserInput.input("Input the size of array ");
        
        int[] array = ArrayCreator.createArray(size);
        
        ArrayInitializer.rndInit(array, 0, 10);
        
        
        
        View.print("Random array " + Arrays.toString(array) +"\n");
        
         View.print("The max element of array is " + ArrayWorker.findMaxElement(array) + "\n");
        
        View.print("The min element of array is " + ArrayWorker.findMinElement(array)+"\n");
          
        View.print("The arithmetic mean of array is " + ArrayWorker.findArithmeticMean(array)+"\n");
        
        View.print("The geometric mean of array is " + ArrayWorker.findGeometricMean(array)+"\n");
        
        View.print("The array has right order from minimum to maximum : " + ArrayWorker.isRightOrderMinToMax(array)+"\n"); 
     
        View.print("The array has right order from maximum to minimum : " + ArrayWorker.isRightOrderMaxToMin(array)+"\n"); 
         
        View.print("First minima of array is  " + ArrayWorker.findFirstMinima(array)+"\n");
        
         View.print("First maxima of array is  " + ArrayWorker.findFirstMaxima(array)+"\n");
        
        View.print("The reverce array is " + Arrays.toString(ArrayWorker.reverseElement(array)) + "\n");
        

               
        
}
}
