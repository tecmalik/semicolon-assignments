import java.util.Scanner;
public class NumbersOrder{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		int firstNumber = input.nextInt();
		System.out.println(" Enter a number : ");
		int secondNumber = input.nextInt();
		System.out.println(" Enter a number : ");
		int thirdNumber = input.nextInt();
		
		if (firstNumber < secondNumber && secondNumber < thirdNumber){
			System.out.println(" Numbers are in increasing order ");
		}
		else if (firstNumber > secondNumber && secondNumber> thirdNumber){
			System.out.println(" Numbers are in decreasing  order ");
		}
		else {
			System.out.println(" Numbers are not in order ");
		}

	}
}