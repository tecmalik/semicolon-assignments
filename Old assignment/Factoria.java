import java.util.Scanner;
public class Factoria{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int factoria = 1;
		System.out.print("Enter number :");
		int number = input.nextInt();
		
		while (number>0){
			factoria *= number; 
			number = number - 1;
		
		}
 		System.out.print( "the number Factoria (!) is = "+ factoria);
	}
}