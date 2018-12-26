/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06D4;

import java.util.Scanner;

/**
 *
 * @author Aliaksiej Protas
 */
public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static long input(String msg) {
        System.out.println(msg);
        return scanner.nextLong();
}

}
