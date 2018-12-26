/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05B;

/**
 *
 *  @author Aliaksiej Protas
 */
import java.util.Random;
public class MoodLogic {
    public static final int moodVariants=5;
    public static final char victory = '\u270C';
    public static final char sad = '\u271A';
    public static final char star = '\u272A'; 
    public static final char frosty = '\u2744'; 
    public static final char happy = '\u263a'; 
    public static char mood = happy;
    
    public static char checkMood() {

        switch (new Random().nextInt(moodVariants)) {
            case 1: mood = victory; break;
            case 2: mood=sad; break;
            case 3: mood=star; break;
            case 4: mood=frosty; break;
            default: mood=happy; break;
        }
        return mood;
    }
}
