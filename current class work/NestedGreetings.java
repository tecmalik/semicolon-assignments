import java.util.Scanner;
public class NestedGreetings{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.print(" Can i greet ?");
		
		System.out.print(" please type out an option :\n1. Morning \n2. Afternoon \n3. Evening \n Enter :");
		String reply = input.nextLine();
		reply.toLowerCase();

		switch (reply){
		case "morning":
			System.out.print(" please choose an option :\n1. English \n2. Yoruba \n3. igbo \n Enter number :");
		int greet = input.nextInt();
		
		switch (greet){
		case 1:
			System.out.print(" hello then ....!!!  ");
		break;
		case 2:
			System.out.print(" bawoni paddy mi ");
		break;
		case 3:
			System.out.print(" otutu woma ");
			break;
		}

			
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