/** 
pseudocode 

step 1
1. prompt collect and store 3 digit
2. separate the numbers each 
3. check if the first number is equal to the last 
4. display result  

step 2
1. prompt the user to Enter a number 
2. collect the number
3. store as integer 
4. calculate digitOne = integer % number 
5. calculate digitTwo = (integer/10) % 10;
6. calculate digitThree = (integer/100) % 10
7. check if the first number is equal to the last 
 if it is display "The number is a palindrome" 
8. check if the first number is not equal the last 
 if it is display "The number is not a palindrome"


*/

import java.util.Scanner; // importing the class scanner from utility package from java API
public class Palindrome{ //declearing a public class with class name Palindrome
	public static void main(String[] args){ // declearing the main method to begin execution of java application
		Scanner input = new Scanner(System.in);/* creating a Scanner object that reads characters typed by the user at the keyboard*/
			System.out.print("Enter a 3 digit integer :");
			 int integer = input.nextInt();// read the user input from the key board and stores it as integer
			 int digitOne = integer% 10;//seprating digit 3 calculation using Remainder operator 
			 int digitTwo = (integer/10) % 10;//seprating digit 2 calculation using division and Remainder operator 
			 int digitThree = (integer/100) % 10; //seprating digit 1 calculation using division and Remainder operator  

			 	if (digitOne == digitThree ) {
    			System.out.println("The number is a palindrome");
				} // ending if statement method body
				if (digitOne != digitThree ) {
    			System.out.println("The number is not a palindrome");
				}// ending if statement method body
			
		
	}// ending main method body
}// ending  the class body 