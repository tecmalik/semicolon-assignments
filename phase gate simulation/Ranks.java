import java.util.Scanner;
public class Ranks{
	public static void main(String[] args ){
	
		Scanner input = new Scanner(System.in);
		
		
			System.out.println(" What's your Rank \n1. Gold Medal \n2. Silver Medal \n3. Bronze \n4. participant ribbon  ");
			System.out.println(" Enter your Rank :");
			int userChoice = input.nextInt();
			switch(userChoice){
			
			case 1 :
				System.out.println("Gold Medal");
			break;
			case 2 :
				System.out.println("Silver Medal");
			break;
			case 3 :
				System.out.println("Bronze ");
			break;
			case 4 :
				System.out.println("participant ribbon ");
			break;
			default: 
				System.out.println("invalid input");
			}
	}
}
