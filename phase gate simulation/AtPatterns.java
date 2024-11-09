import java.util.Scanner;
public class AtPatterns{
	public static void main(String[] args ){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number :");
		int size = input.nextInt();
		for(int value = 1 ; value < size; value++){
			for(int spaces = size ; spaces>value ; spaces--){
				System.out.print(" ");
			}
		
			for(char number = 1 ; number < value ; number++){
				System.out.print("@");
			}
		System.out.println();
			

		}
	}
}