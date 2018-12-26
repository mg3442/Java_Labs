/*
 * Write a program that organizes a dialogue with the user
and checks whether the entered natural number is perfect.
 */
package Lab06B;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab06B {
     public static void main(String[] args) {
     
     
    View.print("Check is the number perfect ");
    
    while (true){
    
    
        int number = UserInput.input("Please, input the number");
  
        View.print("The statement is " + PerfectNumber.isPerfect(number));
     
    if (!Complete.complete("Do you want to continue?")){
            break;
         }
     }    
}
     
}
