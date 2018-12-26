/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab09.LogicTest;

import Lab09.Logic.MatrixWorker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aliaksiej Protas
 */
public class MatrixWorkerTest {
    
    public MatrixWorkerTest() {
    }

    @Test
    public void testTransposeMatrix() {
        System.out.println("transposeMatrix");
        int[][] array = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int row = 3;
        int column = 3;
        int[][] expResult = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] result = MatrixWorker.transposeMatrix(array, row, column);
        assertArrayEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetColumnEvenElements() {
        System.out.println("getColumnEvenElements");
        int[][] array = {{1, 2, 3}, {2, 2, 3}, {2, 4, 1}};;
        int row = 3;
        int column = 3;
        String expResult = " 2 ";
        String result = MatrixWorker.getColumnEvenElements(array, row, column);
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }

    
    
}
