import java.util.Scanner;

public class BodyMassIndex{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the weight in pounds:");
		double weightInPounds = input.nextDouble();
		
		System.out.println("Enter the Hight in inches :");
		double hightInInches = input.nextDouble();
		
		double bodyMassIndex  = (weightInPounds * 0.45359237 )/(hightInInches * 0.0254);
		System.out.printf(" The Body Mass Index : %.4f%n" , bodyMassIndex );
	}
}	