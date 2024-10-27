import java.util.Scanner;
public class Numberchecker{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			
			System.out.print("Enter an integer:");
			int firstInteger = input.nextint();
			
			System.out.print("Enter second integer :");
			int secondInteger = input.nextInt();
			
			System.out.print("Enter third integer :");
			int thirdInteger = input.nextInt();
			
			if (firstInteger == secondInteger // firstInteger == thirdInteger // secondInteger == thirdInteger){
			System.out.print("True");
			}
			else 
			System.out.print("false");
			

			
			
	
	}
 }