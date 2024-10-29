import java.util.Scanner;
public class Numberchecker{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number :");
		int integer = input.nextInt();
		if (integer > 0){
			System.out.print("the number is a positive number");
		}
		else if (integer < 0){
			System.out.print("its a negative number");
		}
		else if (integer == 0){
			System.out.print("its a neutral number");
		}
		
	}
}