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
import java.util.Scanner;
public class Sumofdigitss{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.print("Enter a 3 digit integer :");
			 int integer = input.nextInt();
			 int digitOne = integer% 10;
			 int digitTwo = (integer/10) % 10;
			 int digitThree = (integer/100) % 10; 
			 int sum = digitOne + digitTwo + digitThree;
			System.out.printf("The sum of the digits is: %d%n", sum);
		
	}
}