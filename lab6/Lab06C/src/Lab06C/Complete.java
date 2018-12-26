/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06C;

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Scanner;
public class Complete {
    public static boolean complete(String question){
        System.out.println(question + "Yes or No");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next().toLowerCase();
        return answer.equals("yes");
    }
}
