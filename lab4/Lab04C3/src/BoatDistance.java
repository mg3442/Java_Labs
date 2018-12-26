/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aliaksiej Protas
 */
public class BoatDistance {
    public static double findDistance(double t1, double t2, double v, double u) {
        double distance = t1 * (v + u) + t2 * (v - u);
        return distance;
    }
    
}
