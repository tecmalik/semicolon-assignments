import java.util.Scanner;
public class largestNumberSmallestNumberItration{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		 
			int collectedNumber = input.nextInt();
			int numberCounter = 1 ;
			int largestNumber = collectedNumber;
			int smallestNumber = collectedNumber;
			
			
				System.out.print("Enter a number or -1 to exit :");
				decisionNumber = input.nextInt();
				do{
					System.out.printf("\nEnter " + numberCounter + " number or  -1 to exit :");
					numberCounter = numberCounter + 1;
					decisionNumber = input.nextInt();
					
					if(decisionNumber < smallestNumber  ){
						smallestNumber = collectedNumber;
					}
					if(decisionNumber > largestNumber){
						largestNumber = collectedNumber;
					}
				}while(decisionNumber != -1);
				
					System.out.printf(" The Largest Number is %d", largestNumber);
					System.out.printf(" The Smallest Number is %d", smallestNumber);
	}
}