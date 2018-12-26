/*
 Write a program that determines whether the letter you entered is
vowel or consonant (try to make a minimum in four ways,
more is allowed).
 */
package Lab05D;

/**
 *
 * @author Aliaksiej Protas
 */

public class Lab05D {
    public static void main(String[] args) {

        View.print("The programm determines whether the letter you entered is vowel or consonant");

           char ch = UserInput.input("Input the char ");
           
           
       View.print("\n The char vowel? \n First method: " + LetterLogic.Method1(ch));
       View.print("\n Second method: " + LetterLogic.Method2(ch));
       View.print("\n Third method: " + LetterLogic.Method3(ch));
       View.print("\n Forth method: " + LetterLogic.Method4(ch));

       
    }
    
}
