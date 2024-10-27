import java.util.Scanner;
public class LargestNumber{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		int numberCounter = 0;
		int largestNumber = 0;
		int smallestNumber = 0;
		
		System.out.println("Enter a number or exit with -1:");
		int firstNumber = input.nextInt();
		if (firstNumber == -1){
			System.out.println(" no number was inputed");
			}		
			largestNumber = firstNumber;
			smallestNumber = firstNumber;
		while(firstNumber != -1){
			System.out.println("Enter a number or exit with -1:");
			firstNumber = input.nextInt();
			 
			
			if (firstNumber > largestNumber && firstNumber != -1){
				largestNumber = firstNumber;
			}
			 if (firstNumber < smallestNumber && firstNumber != -1){
				smallestNumber = firstNumber;
			} 

			numberCounter++;
		}
		System.out.println(largestNumber+" is the largest number");
		System.out.println(smallestNumber+" is the smallest number");

	}
}