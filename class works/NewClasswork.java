import java.util.Scanner;

public class waterEnergy{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Amount of water in kilograms:");
		double weightOfWater = input.nextDouble();
		
		System.out.println("Enter the initial temperature of water in Celsius :");
		double initialTemperature = input.nextDouble();
		
		System.out.println("Enter the final temperature of water in Celsius:");
		double finalTemperature = input.nextDouble();
		
		double energy = ( weightOfWater * (finalTemperature - initialTemperature) * 4184;
		System.out.print("The energy(Q) needed is %.4f%n", energy);
	}
}