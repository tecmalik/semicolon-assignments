/**
pseudocode
step 1
prompt collect and store 3 digit
separate the numbers each 
add the three digit each 
store & display result  
 step 2
prompt the user to enter a 3 digit integer
collect the number
store as integer 
calculate the digit one = integer%10
store as digit one
calculate digit two = (integer/10)% 10
store as digit two 
calculate digit three = (integer/100)%10   
store as digit three
calculate the sum = digit 1 + digit 2 + digit 3
store as sum 
display sum

*/
import java.util.Scanner;// importing the class scanner from utility package from java API
public class Sumofdigitss{// declearing a public class with class name Sumofdigits 
	public static void main(String[] args){// declearing the main method to begin execution of java application  
		Scanner input = new Scanner(System.in);/* creating a Scanner object that reads characters typed
								 by the user at the keyboard*/
			System.out.print("Enter a 3 digit integer :");// prompt the user to enter three digit integer 
			 int integer = input.nextInt();// read the user input from the key board ans store it as integer
			 int digitOne = integer% 10;// seprating digit 3 calculation using Remainder operator 
			 int digitTwo = (integer/10) % 10;// seprating digit 2 calculation using division and Remainder operator 
			 int digitThree = (integer/100) % 10;// seprating digit 1 calculation using division and Remainder operator 
			 int sumOfDigits = digitOne + digitTwo + digitThree;// suming the 3 digit up and storing it as sumOfDigits
			System.out.printf("The sum of the three last Entered digits is: %d%n", sumOfDigits);// seprating digit 3 calculation using digit
		
	}// ending main method body
}// ending  the class body 