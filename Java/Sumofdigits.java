/**
pseudocode 
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
public class Sumofdigits{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.print("Enter a 3 digit integer :");
			 int integer = input.nextInt();
			 int digitone = integer% 10;
			 int digittwo = (integer/10) % 10;
			 int digitthree = (integer/100) % 10; 
			 int sum = digitone + digittwo + digitthree;
			System.out.printf("The sum of the digit's is: %d%n", sum);
		
	}
}