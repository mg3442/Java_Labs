/*
design and develop a simple interactive
application that would ask the user for the appropriate in-
a formation about him (her)(for example, the date of birth, where he works, who he works for, hobbies
and hobbies, favorite aphorism or slogan, marital status, how many in
day works, rests, etc.), and then displays all the user input
information in a tabular form on the monitor screen.
*/




import java.util.Scanner;// import the class in order to  enter information from the keyboard into the program


public class Interrogation{

public static void main (String[] args) {
	
	
	
	
	
	
	String name = "";
	String surname = "";
	String dateOfBirth = "";
	String occupation = "";
	String position = "";
	String hobby = "";
	String credo = "";
	String maritalStatus = "";
	
	
	
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("\t Input your name");
	name = sc.nextLine();
	System.out.println("\t Input your surname");
	surname = sc.nextLine();
	System.out.println("\t Input your date of birth");
	dateOfBirth = sc.nextLine();
	System.out.println("\t Input your occupation type");
	occupation = sc.nextLine();
	System.out.println("\t Input your position at work/occupation");
	position = sc.nextLine();
	System.out.println("\t What are your hobbies?");
	hobby = sc.nextLine();
	System.out.println("\t What is your credo?");
	credo = sc.nextLine();
	System.out.println("\t Input your marital status");
	maritalStatus = sc.nextLine();
	
	
	
	
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	
	System.out.printf("\t %-40s%-40s\n","Name: ",name);
	System.out.printf("\t %-40s%-40s\n","surname: ", surname);
	System.out.printf("\t %-40s%-40s\n","Date of birth: ", dateOfBirth);
	System.out.printf("\t %-40s%-40s\n","Occupation: ", occupation);
	
	System.out.printf("\t %-40s%-40s\n","Position: ", position);
	System.out.printf("\t %-40s%-40s\n","Hobbies: ", hobby);
	System.out.printf("\t %-40s%-40s\n","Credo :", credo);
	System.out.printf("\t %-40s%-40s\n","Marital status: ", maritalStatus);
    
	
	
	
	
}
}