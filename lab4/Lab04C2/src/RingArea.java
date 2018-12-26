/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aliaksiej Protas
 */
public class RingArea {
     final static double PI = 3.141593;

    public static double findArea(double r1, double r2) {
        double area1  = PI * r1 * r1;
        double area2 = PI * r2 * r2;
        double ringarea = area1 - area2;

        return ringarea;

    }
    
    
}
