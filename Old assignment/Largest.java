import java.util.Scanner;
public class Largest{
	public static void main(String[] args){
	
		Scanner input= new Scanner(System.in);
		
		int counter = 0;
		int number = 0;
		int largest = 0;
		
		while (counter < 10){
			System.out.print("Enter number : ");
			number = input.nextInt();
			counter+= 1;
			
			if (number > largest){
				largest = number;
			}
						
		}
		
	System.out.printf("the largest number is %d and themost recently input by the user %d \n totl number inputed is %d", largest , number,counter);

		
	}
}