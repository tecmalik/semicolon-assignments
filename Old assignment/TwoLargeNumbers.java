import java.util.Scanner;
public class TwoLargeNumbers{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			System.out.print("Enter number : ");
			int number = input.nextInt();
		int counter = 1;
		int firstlargest = number;
		int secondlargest = 0;
 		while (counter < 10){
			System.out.print("Enter number : ");
			number = input.nextInt();
			counter+= 1;
			
			if (number > firstlargest){
				secondlargest = firstlargest;
				firstlargest = number;
			}
			if (number > secondlargest){

	 		secondlargest = number; 
			}
			
		}
		
	System.out.printf("the two largest numbers are %d and %d", firstlargest , secondlargest);
	}
}