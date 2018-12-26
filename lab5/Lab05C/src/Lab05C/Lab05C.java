/*
 * Write a program that would emulate the game "Dice".
Programm throws two hexagonal cubes and counting
the total amount of points that fell on the first and second bones
 */
package Lab05C;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab05C {
    public static void main(String[] args){
        View.print("Let's play Dice!!!");
        
        int firstThrow = DiceLogic.throw1();
        int secondThrow = DiceLogic.throw2();
        int result = firstThrow + secondThrow;
        
        View.print("\n First throw: " + firstThrow + "\n Second throw: " + secondThrow +
                "\n Your result: " + result);
    }
}
