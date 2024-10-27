import java.util.Scanner;
public class FloatNumbers{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("enter a decimal number :");
		float firstNumber = input.nextFloat();
		
		System.out.println("enter a desimal number :");
		float secondNumber = input.nextFloat();
		if ( firstNumber != secondNumber){
			System.out.println(" they are different ");
		}
		else {
			System.out.println(" they are same numbers ");
		}
		
	}
}