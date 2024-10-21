import java.util.Scanner; 
public class largestAndSmallestNumber{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
			
			int realNumber;
			int smallestNumber = 0;
			int largestNumber = 0;
			int numberCounter = 1;
			
			System.out.print(" How many numbers would you like to Enter ?:");
			int intendedNumber = input.nextInt();
			
			do {
					realNumber = 0;
					smallestNumber = 0;
					largestNumber = 0;
				 	System.out.println(" Enter "+ numberCounter + " number : ");
						realNumber = input.nextInt();
							realNumber = 0 + realNumber;
						numberCounter = numberCounter + 1;
				
					if(realNumber > realNumber ){  
						largestNumber = realNumber;
										}
				 	 else if(realNumber < realNumber){
						smallestNumber =  realNumber ;
						
					}
				
			} while (numberCounter <= intendedNumber);
			System.out.print("thank you"+"\n"); 
			System.out.print("largest number ="+ largestNumber+"\n"); 
			System.out.println("smallest number ="+ smallestNumber);
	}
} 