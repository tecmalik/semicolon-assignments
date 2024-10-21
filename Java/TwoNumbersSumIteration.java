import java.util.Scanner;
public class TwoNumbersSumIteration{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			
			int total = 0;
			int numberCounter = 1;
			int decitionNumber = 0;
			
				System.out.print(" Enter two numbers to be summed up");
			while (numberCounter <= 2){
				System.out.println(" Enter number ");
				int enteredNumber = input.NextInt();
				
				total = total + enteredNumber;
				numberCounter = numberCounter + 1;

				System.out.printf(" The sum of both numbers is %d%n" , total);	
						
					
					while (numberCounter = 2) {
						System.out.println("do you wish to repeat this operation enter 1 to repeat any number to terminate  ?");
						int dicitionNumber = input.nextInt();
						
						if(dectionNumber = 1){
							while (numberCounter <= 2)
								System.out.println(" Enter number ");
								int enteredNumber = input.NextInt();
							
								total = total - total + enteredNumber;
								numberCounter = numberCounter + 1;
								System.out.printf(" The sum of both numbers is %d%n" , total);
							}
						}
						if (decitionNumber != 1) { 
							 numberCounter = numberCounter + 1;
							System.out.printf("Thank you bye");
						}
					}
			}
	}

}