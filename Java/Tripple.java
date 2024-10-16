/**
question 
Write an application that reads two integers, determines whether the first
number tripled is a multiple of the second number doubled, and prints the result. 
 pusedocode:
step 1:
1. prompt the user to enter a fist integer
2. collect and store the number
3. prompt the user to enter a second integer 
4. collect and store the number
5. tripple the first integer
6. square  the second integer
7. calculate divisibility
8. if  the first number trippled % second number doubled print is equal to 0 display the firstnumber tripled is a multiple of the second number doubled
9. if  the first number trippled % second number doubled print is not equal to 0 display the firstnumber tripled is not a multiple of the second number doubled 
step 2:
1. prompt the user to enter a fist integer
2. collect the number
3. store the number as the firstintrger
4. prompt the user to enter a secondinteger 
5. collect the number
6. store the number as secondnumberdoubled
7. tripple the firstinteger
8. store as firstintegertrippled
9. square the secondinteger
10. store as secondintegerdoubled  
11. calculate divisibility = firstintegertrippled % secondintegerdoubled
12. store as divisibility
13. if divisibility is equal to 0 display the firstnumber tripled is a multiple of the second number doubled
14. if divisibility is not equal to 0 display the firstnumber tripled is not a multiple of the second number doubled 

*/

import java.util.Scanner;
	public class Tripple{
		public static void main(String[] agrs){
			Scanner input = new Scanner(System.in);
				System.out.println("input first integer :");
				int number1 = input.nextInt();
				System.out.println("input second integer :");
				int number2 = input.nextInt();
				int firstNumberTripple = 3 * number1;
				int doubleSecondNumber = 2 * number2;
				int divisibility = doubleSecondNumber%firstNumberTripple;

				if (divisibility != 0){ 
				System.out.println("the firstnumber tripled is not a multiple of the second number doubled");}

				if (divisibility == 0){System.out.println("the firstnumber tripled is a multiple of the second number doubled");}
		}
	}