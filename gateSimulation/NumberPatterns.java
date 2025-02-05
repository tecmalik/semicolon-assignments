import java.util.Scanner;
public class NumberPatterns{
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int userNumber = input.nextInt();
		
		for(int value = 0 ; value < userNumber; value++){
			
		
			for(int number = 0 ; number < value ; number++){
				System.out.print(number+1);
			}

			System.out.println(" ");
			

		}
			for(int value2 = 0 ; value2 <userNumber ; value2++){
			
		
			for(int number2 = value2  ; number2 < userNumber ; number2++){
				System.out.print(number2+1-value2);
			}
			
			System.out.println(" ");
			

		}

		
	
	}
}