/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aliaksiej Protas
 */
public class Logic {
	
	public static boolean checkIfDifferent(double a, double b, double c) {
            
		
        boolean answer;
        answer = (a!=b || b!=c || a!=c);
        return answer;

	}
        
        
        
        public static boolean checkIfPositiveNumber(double a, double b, double c) {
        boolean answer;    

        answer = a > 0 || b > 0 || c > 0;
        return answer;
        
    }
         public static boolean checkEvenOrOdd(double a, double b, double c) {
        boolean answer;    

        answer = ((a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0)) || ((a % 2 != 0) && (b % 2 != 0) && (c % 2 != 0));
        return answer;
        
    }
         
         public static boolean checkIfTriangleSides(double a, double b, double c) {
         boolean answer;
        answer = ( a + b > c && a + c > b && b + c > a);
        return answer;
    }
            public static boolean checkIfRightTriangle(double a, double b, double c) {
         boolean answer;
        answer = ( (a * a + b * b == c * c) || (a * a + c * c == b * b) || (c * c + b * b == c * c));
        return answer;
    }

}

    

