import java.util.Scanner;
public class AdditionApplication2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number");
		int firstNumber = input.nextInt(); 
		System.out.print("Enter second number");
		double firstSecond = input.nextDouble();
		System.out.print("Enter third number"); 
		float firstThird = input.nextFloat(); 
		double sum = firstNumber + firstSecond + firstThird;
		
		System.out.printf("The sum is %.4f%n" , sum); 
	}
}