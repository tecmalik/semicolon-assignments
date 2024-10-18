

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