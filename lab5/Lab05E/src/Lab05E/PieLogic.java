/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05E;

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Random;
public class PieLogic {
       public static final int NUMBER1= 5;
    public static final String M = "meet";
    public static final String F = "fish";
    public static final String R = "rice";
    public static final String T = "trash";
    public static final String J = "jam";
    public static String SURPRISE = J;
    
    public static final int NUMBER2 = 3;
    public static final String H = "hamburger";
    public static final String C = "cheeseburger"; 
    public static final String RB = "royalburger"; 
    public static String PIE = H;
    
    public static String chooseSurprise() {
            
        switch (new Random().nextInt(NUMBER1)+1) {
            case 1: SURPRISE=M; break;
            case 2: SURPRISE=R; break;
            case 3: SURPRISE=F; break;
            case 4: SURPRISE=T; break;
            case 5: SURPRISE=J; break;
        }
        return SURPRISE;
}
           
    public static String chooseCake() {     
          switch (new Random().nextInt(NUMBER2)+1) {
            case 1: PIE=H; break;
            case 2: PIE=C; break;
            case 3: PIE=RB; break;
        }
        return PIE;
               
           }
}
