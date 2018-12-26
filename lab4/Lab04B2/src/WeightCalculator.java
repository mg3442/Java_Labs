/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aliaksiej Protas
 */
public class WeightCalculator {
    
    
	public static double calculateKilogram(double  weightGrams) {
		   
      return  weightGrams / 1000.0;

	}

	public static double calculateCentner(double  weightGrams) {
		   
      return  weightGrams / 1000.0 / 100.0;

	}
    
    public static double calculateTon(double  weightGrams) {
		   
      return  weightGrams / 1000.0 / 100.0 / 1000.0;

	}
    
}
