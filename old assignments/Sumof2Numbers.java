import java.util.Scanner;
public class Sumof2Numbers{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		String repeat;
		int numberCounter = 1;
		System.out.println( " enter 2 numbers");

		do{
			System.out.println( "enter number : ");
			int numbers = input.nextInt();
			System.out.println( "enter numbers : ");
			int number2 = input.nextInt();
			 sum = number2 + numbers;
			System.out.printf( "the sum is %d ", sum);
			System.out.printf( "would you like to repeat the process ?, type yes to continue ");
			input.nextLine();
			repeat = input.nextLine();
			numberCounter++;
			
		}while( numberCounter <= 2);
		
		
		
	}
}