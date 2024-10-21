

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