/*
 Write the program "Heads or Tails" ,
"You input the number of repeats, for example, 1000 times and programm
reportes the number of heads and tails.
 */
package Lab06A;

/**
 *
 * @author Aliaksiej Protas
 */
public class Lab06A {
     public static void main(String[] args) {
         
        View.print("\n Lets play Heads or Tails!!!! \n The program will show your the number of repeats");
        
        while (true){
        
        int number = UserInput.input("\n Input number of repeats:");
        int heads = CoinCount.Heads(number);
        
       
       
       View.print("\n The number of the Heads is: " + heads  + 
               "\n The number of the Tails is: " + (number - heads));
    
         if (!Complete.complete("Do you want to continue?")){
            break;
         }
     }    
}

}