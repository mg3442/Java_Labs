/*
* Write a program - simulator pies with a "surprise." Program
* should bring out a pie and one of the five (more) various “sur-
* prizes ”, which would be chosen randomly.
 */
package Lab05E;

/**
 *
 * @author Aliaksiej Protas
 */

public class Lab05E {
    
    public static void main(String[] args) {
        View.print("Congrats!!! \n You've got a pie!");
        
        View.print(PieLogic.chooseCake() + " with " + PieLogic.chooseSurprise());
        
    }
    
}
