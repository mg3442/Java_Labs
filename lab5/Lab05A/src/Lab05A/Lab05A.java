/*
 * The young dragon grows 3 heads each year, but after he turns 200 years -  only 2, 
 * and after 300 year- only 1. Develop a program that calculates how many heads and eyes has the dragon N years old.
 */
package Lab05A;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab05A {
     public static void main(String[] args) {

        View.print("The programm counts the number of dragons heads and eyes");

        int age = UserInput.input("Input age of the dragon: ");

        int head = headCalc.headCount(age);
        int eyes = headCalc.eyesCount(age);

        View.print("The dragon has " + head + " heads" + " and " + eyes + " eyes");
    }
    
}
