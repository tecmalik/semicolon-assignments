import java.util.Scanner;
public class SumOfNumbers{
	public static void main(String[] args ){
		
		Scanner input = new Scanner(System.in);
		
		int number =0;
		int sum = 1;
		while(number!=-1){
			System.out.println("Enter positive numbers to be summed up or -1 to exit : ");
			number = input.nextInt();
			sum += number;
		
		}
		
		
		
		System.out.print(" The sum of all Number numbers is "+sum);

	
	}
}
