/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aliaksiej Protas
 */
public class ReverceNumber {
    public static int getReverceNumber(int sourceNumber) {
		   
      
        int b = sourceNumber % 10;
        int c = (sourceNumber / 10) % 10;
        int d = ((sourceNumber / 10) / 10) % 10;
        int e = sourceNumber / 1000;
        int answer = ((b * 1000) + (c * 100) + (d * 10) + e);

        return answer;

	}
    
}
