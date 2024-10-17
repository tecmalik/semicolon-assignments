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

import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.print("Enter a 3 digit integer :");
			 int integer = input.nextInt();
			 int digitOne = integer% 10;
			 int digitTwo = (integer/10) % 10;
			 int digitThree = (integer/100) % 10; 

			 	if (digitOne == digitThree ) {
    			System.out.println("The number is a palindrome");
				}
				if (digitOne != digitThree ) {
    			System.out.println("The number is not a palindrome");
				}
			
		
	}
}