import java.util.Scanner; 
public class largestAndSmallestNumber{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
			
			int realNumber;
			int smallestNumber = 0;
			int largestNumber = 0;
			int numberCounter = 1;
			int nutralNumber = realNumber;
			
			System.out.print(" How many numbers would you like to Enter ?:");
			int intendedNumber = input.nextInt();
			
			do {
					
					
				 	System.out.println(" Enter "+ numberCounter + " number : ");
						realNumber = input.nextInt();
							
						numberCounter = numberCounter + 1;
				
					if( realNumber > nutralNumber  ){  
						largestNumber = realNumber;
										}
				 	 if(realNumber < nutralNumber){
						smallestNumber =  realNumber ;
						
					}
				
			} while (numberCounter <= intendedNumber);
			System.out.print("thank you"+"\n"); 
			System.out.print("largest number ="+ largestNumber+"\n"); 
			System.out.println("smallest number ="+ smallestNumber);
	}
} 