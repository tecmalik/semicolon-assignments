import java.util.Scanner;
public class Greetings{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.print(" Can i greet ?");
		
		System.out.print(" please type out an option :\n1. Morning \n2. Afternoon \n3. Evening \n Enter :");
		String reply = input.nextLine();
		reply.toLowerCase();

		switch (reply){
		case "morning":
			System.out.print(" Good morning ");
		break;
		case "afternoon":
			System.out.print(" Good afternoon ");
		break;
		case "evening":
			System.out.print(" good night. ");
			break;
		}
		
		
	}		
}