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

 
 import java.util.Scanner; //importing scanner fom java utilities library  
public class Bmicalculator{ // declearing a public class bmiclaculator
	public static void main(String[] args){ // main method to begin execution of java application  
		Scanner input = new Scanner(System.in); // creating a Scanner object that reads characters typed by the user at the keyboard
		  System.out.print("Enter the weight in pounds :"); // prompting a user to Enter a number 
		double weightInPounds = input.nextDouble();// read the user input from the key board and storing it as weightInPounds
		  System.out.print("Enter the height in inches :");// prompting users to enter the height in inches
		double heightIninches = input.nextDouble();// colleting the number input from the user and storing it as heightInHeight
		  double bodyMassIndex = weightInPounds / (heightIninches * heightIninches);// calculate and store the bodyMathsIndex 
		  System.out.printf("The Body Mass Index is %.4f%n" , bodyMassIndex );/*display the result*/
	}// ending main method body
}// ending  the class body 