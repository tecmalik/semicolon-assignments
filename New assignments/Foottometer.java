/**
pseudocode 
step 1
prompt and collect the user to enter a number in foot 
convert the number to meters 
display the number in meter 
step 2
1. prompt tp Enter a number in foot 
2. collect the number
3. store the number
4. calculate numberinMeter = number * 0.305
5. store the number 
6. display numberinMeter


*/

import java.util.Scanner; // importing the class scanner from utility package from java API
public class Foottometer{ //declearing a public class with class name Foottometer
	public static void main(String[]args){// declearing the main method to begin execution of java application
		Scanner input = new Scanner(System.in);/* creating a Scanner object that reads characters typed by the user at the keyboard*/
		 System.out.println("Enter Values in Foot:");// prompting the user to input the value to be converted in foot
		  double number1 = input.nextDouble(); //read the user input from the key board and stores it as number1
		  double numberInMeter = number1 * 0.305; // calculating the coversion and storing it in numberInMeters
		 System.out.printf("Value in meter is %.4f%n", numberInMeter); // displaying the value of the numberInMeters 
	}// ending main method body
}// ending  the class body 