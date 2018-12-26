/*
 * The programm will show you the  reverse of your number
 */
package Lab06C;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab06C {
    public static void main(String[] args) {
     
     
    View.print("The programm will show you the "
            + " reverse of your number ");
    
    while (true){
    
    
        int number = UserInput.input("Please, input the number");
  
        View.print("The reverse number is " + ReverseNumber.findReverse(number));
     
    if (!Complete.complete("Do you want to continue?")){
            break;
         }
     }    
}
}
