import java.util.Scanner;
public class EligibleChecker{
	public static void main(String[] args ){
	
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter Your Age :");
		int userAge = input.nextInt();
		
		
		if(userAge >= 18 ){
			System.out.println("you are eligible to vote");
		}
		if (userAge >= 16 ){
			System.out.println("you are eligible to drive ");
		}
		if ( userAge >= 21 ){
			System.out.println("you are eligible to drink " );
		}		



	
	}
}
