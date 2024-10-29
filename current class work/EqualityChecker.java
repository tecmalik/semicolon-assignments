import java.util.Scanner;
public class EqualityChecker{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first Number :");
		int firstNumber = scanner.nextInt();
		System.out.print("Enter Second Number :");
		int secondNumber = scanner.nextInt();
		System.out.print("Enter third Number :");
		int thirdNumber = scanner.nextInt();
		
		if(firstNumber == secondNumber && secondNumber == thirdNumber){
			System.out.print(" All Numbers are Equal ");
		}
		else{
			System.out.print("All Numbers are not Equal");
		}

		
		
	}
}