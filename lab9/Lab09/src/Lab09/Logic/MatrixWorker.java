/*
 *B24
 *Transpose the square matrix.
     
 */
package Lab09.Logic;

/**
 *
 * @author Aliaksiej Protas
 */
public class MatrixWorker {
     /*B24
    Transpose the square matrix.
     */
    public static int[][] transposeMatrix(int[][] array, int row, int column) {

        if (row!= column){
            System.out.println("Matrix not Square!!! Can't be transpose!!!");
        }
        else{    
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
            
        }
        }
            return array;
        
        
        
}
    
   /*A1
    Output the column numbers, all the elements of which are even..
     */ 
   public static String getColumnEvenElements (int[][] array, int row, int column) {
		String answer = " ";
		boolean flag = true;
		int count = 0;

		for (int j = 0; j < column; j++) {
			for (int i = 0; i < row; i++) {
				if (array[i][j] % 2 != 0) {
					flag = false;
				}
			}
			if (flag) {
				answer += Integer.toString(j + 1) + " ";
				count++;
			}
			flag = true;
		}
		if (count == 0) {
			answer = " no columns.";
		}

		return answer;
	}
    
}
