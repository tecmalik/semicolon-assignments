import java.util.Scanner;
public class TwoNumbersSumIteration2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			
			int total ;
			int numberCounter ;
			int decisionNumber = 0;
			
			do {	
				total = 0;
				numberCounter = 1 ;
				System.out.print(" Enter two numbers to be summed up");
			
				while (numberCounter <= 2){
					System.out.println(" Enter number ");
					int enteredNumber = input.nextInt();
				
					total = total + enteredNumber;
					numberCounter = numberCounter + 1;
				}

				System.out.printf(" The sum of both numbers is %d%n" , total);	
				System.out.println("do you wish to repeat this operation enter 1 to repeat any number to terminate  ?");
					decisionNumber = input.nextInt();
			    }while (decisionNumber == 1);
				System.out.printf(" The sum of the last two digit is numbers is %d%n" , total);
							
			
	}

}