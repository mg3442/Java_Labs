/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05D;

/**
 *
 * @author Aliaksiej Protas
 */
import java.util.Scanner;
public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static char input(String msg) {
        System.out.println(msg);
        return scanner.next().charAt(0);
    }
}
