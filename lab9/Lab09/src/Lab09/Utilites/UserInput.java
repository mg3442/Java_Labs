/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab09.Utilites;

import java.util.Scanner;

/**
 *
 * @author Aliaksiej Protas
 */
public class UserInput {
     private static Scanner scanner = new Scanner(System.in);

    public static int input(String msg) {
        System.out.print(msg);
        return scanner.nextInt();
    }
    
}
