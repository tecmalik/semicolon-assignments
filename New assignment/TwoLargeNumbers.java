import java.util.Scanner;
public class TwoLargeNumbers{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int firstlargest = 0;
		int secondlargest = 0;
 		while (counter < 10){
			System.out.print("Enter number : ");
			int number = input.nextInt();
			counter+= 1;
			
			if (number > firstlargest){
				firstlargest = number;
			}
			if (number > secondlargest && number != firstlargest){

	 		secondlargest = number; 
			}
			
		}
		
	System.out.printf("the two largest numbers are %d and %d", firstlargest , secondlargest);
	}
}