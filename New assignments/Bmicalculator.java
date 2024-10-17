/**
pseudocode
step 1 
1. prompt the user to enter  weight in pounds, height in inches 
2. calculate BMI = weight in kilograms / (height in inches * height in inches)
3. display BMI 

Step 2
1. prompt the user to enter the weight in pounds
2. collect the number 
3. store the number as  weightInPounds
4. prompt the user to enter the height in inches
5. collect the number 
6. store the number as  heightIninches
7. calculate the Body Mass Index = weight in Pounds / (height in inches * height in inches)
8. store as BMI
9.display result 

*/

 
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