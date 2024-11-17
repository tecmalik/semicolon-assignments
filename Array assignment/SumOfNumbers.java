import java.util.Scanner;
public class SumOfNumbers{
	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);
		int[] setOfNumbers = new int[5];
		int sum = 0;
		
		for(int counter = 0; counter<setOfNumbers.length ; counter++ ){
			System.out.print("Enter a array of number : "); 
			setOfNumbers[counter] = input.nextInt();
			sum +=setOfNumbers[counter];
		
		}

		System.out.print("the sum of all the numbers is "+ sum);
	}

}