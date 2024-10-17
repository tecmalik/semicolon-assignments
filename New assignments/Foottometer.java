\**
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

import java.util.Scanner;
public class Foottometer{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter Values in Foot:");
		  double number1 = input.nextDouble(); 
		  double numberInMeter = number1 * 0.305;
		 System.out.printf("Value in meter is %.4f%n", numberInMeter);
	}
}