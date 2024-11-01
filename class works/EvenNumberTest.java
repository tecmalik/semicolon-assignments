import java.util.Scanner;
public class EvenNumberTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a  number:");
			int number = input.nextInt();
				

			if (number % 2 == 0){
				System.out.print(" the number is even 1 ");
			}
			else System.out.print(" the number is odd  0 ");
			
			
	}
}