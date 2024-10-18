 
 import java.util.Scanner;  
public class Bmicalculator{ 
	public static void main(String[] args){   
		Scanner input = new Scanner(System.in); 
		  System.out.print("Enter the weight in pounds :"); 
		double weightInPounds = input.nextDouble();
		  System.out.print("Enter the height in inches :");
		double heightIninches = input.nextDouble();		 
 		double bodyMassIndex = weightInPounds / (heightIninches * heightIninches); 
		  System.out.printf("The Body Mass Index is %.4f%n" , bodyMassIndex );
	}
}