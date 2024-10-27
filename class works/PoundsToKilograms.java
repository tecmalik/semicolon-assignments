import java.util.Scanner;

public class PoundsToKilograms{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a number in pounds:");
		double pounds = input.nextDouble();
				
		double poundsToKilograms = pounds * 0.454;
		System.out.printf("The number "+ pounds + " in Kilogrsms is %.3f%n", poundsToKilograms);
	}
}	