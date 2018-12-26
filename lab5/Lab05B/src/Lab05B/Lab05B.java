/*
 * The programm shows your mood by random
 */
package Lab05B;

/**
 *
 *  @author Aliaksiej Protas
 */
public class Lab05B {
    public static void main(String[] args) {

        View.print("The programm shows your mood");

        char yourMood = MoodLogic.checkMood();

        View.print("Your mood is  " + yourMood);
    }
}
