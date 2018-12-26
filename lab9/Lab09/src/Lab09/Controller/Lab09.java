/*
 *B24
 *Transpose the square matrix..
 */
package Lab09.Controller;

import Lab09.Logic.*;
import Lab09.Utilites.*;
import java.util.Arrays;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab09 {
     public static void main(String[] args){
       
        int row =UserInput.input("Enter count row of matrix: ");
        int column = UserInput.input("Enter count columns of matrix: ");

        int[][] array = ArrayCreator.createArray(row,column);

        ArrayIniatializer.rndInit(array, 0, 9, row, column);
       
        View.print("Matrix: \n" + Arrays.deepToString(array).replace("], ", "]\n"));
        
        View.print("\n");
        
        
       
        View.print("A column with all even elements: \n" + MatrixWorker.getColumnEvenElements(array, row, column));
       
        View.print("\n");
       
                
        View.print("Transpose Matrix: \n"
              + Arrays.deepToString(MatrixWorker.transposeMatrix(array, row, column)).replace("], ", "]\n"));
        
    }
}
