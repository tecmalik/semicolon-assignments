import java.util.Scanner;
public class NumbersOrder2{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
	
		int secondNumber = 0;
		int firstNumber = 0;
		int thirdNumber = 0;
		while (firstNumber != -1){
			++firstNumber;
		System.out.println(" Enter a number or -1 to exit : ");
		 firstNumber = input.nextInt();
		System.out.println(" Enter a number -1 to exit : ");
		 secondNumber = input.nextInt();
		System.out.println(" Enter a number -1 to exit : ");
		 thirdNumber = input.nextInt();
		
		if (firstNumber < secondNumber && secondNumber < thirdNumber && firstNumber != -1){
			System.out.println(" Numbers are in increasing order ");
		}
		else if (firstNumber > secondNumber && secondNumber> thirdNumber && firstNumber != -1){
			System.out.println(" Numbers are in decreasing order ");
		}
		else {
			System.out.println(" Numbers are not in order ");
		} 
		}

	}
}