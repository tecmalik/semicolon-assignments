import java.util.Scanner;
public class DaysOfTheWeek{
	public static void main(String[] args ){
	
		Scanner input = new Scanner(System.in);
		
		
		
		
			System.out.println(" make a choice\n1. Monday \n2. Tuesday \n3. Wednesday \n4. Thursday \n5. Friday \n6. Saturday \n7. Sunday ");
			System.out.println(" Enter Days of the week:");
			int userChoice = input.nextInt();
			switch(userChoice){
			
			case 1 :
				System.out.println("Monday");
			break;
			case 2 :
				System.out.println("Tuesday");
			break;
			case 3 :
				System.out.println("Wednesday ");
			break;
			case 4 :
				System.out.println("Thursday ");
			break;
			case 5 :
				System.out.println("Friday");
			break;
			case 6 :
				System.out.println("Saturday");
			break;
			case 7 :
				System.out.println("Sunday");
			break;
			default: 
				System.out.println("invalid input");
			}
	}
}
