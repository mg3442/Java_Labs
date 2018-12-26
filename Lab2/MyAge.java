/*You have to enter information about your birthday.
*/

import java.text.SimpleDateFormat;//library for date format determin. 
import java.util.Date;// library for Date objects creation
import java.util.Scanner;// import the class in order to  enter information from the keyboard 



public class  MyAge {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat
		("dd.MM.yyyy");
		Date currentDate = new Date();
		Date birthDate = new Date();

		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your date of birth: ");
		String date = sc.nextLine();
		try {
			birthDate = dateFormat.parse(date);
		}
		catch (Exception var12) {
			System.out.println("Mistake, please enter data in (\"dd.MM.yyyy\") format");
			
		}
		
		
		System.out.println(date);
        long current = currentDate.getTime();
        long fullTime = birthDate.getTime();
        long lifeTime = current - fullTime;
        System.out.println("__________________________");
		System.out.println("___________________________");
        System.out.printf("You've lived " + lifeTime / 1000L / 60L / 60L / 24L / 365L + "years!\n");
        System.out.printf("You've lived " + lifeTime / 1000L / 60L / 60L / 24L + "days!\n");
		 System.out.printf("You've lived " + lifeTime / 1000L / 60L / 60L  + "hours!\n");
        System.out.printf("You've lived " + lifeTime / 1000L / 60L + "minutes!\n");
        System.out.printf("You've lived " + lifeTime / 1000L  + "seconds!\n");
        System.out.printf("You've lived " + lifeTime + "milliseconds!\n");
        System.out.println("__________________________");
		System.out.println("___________________________");
    }
}