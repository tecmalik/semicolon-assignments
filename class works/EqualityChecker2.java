import java.util.Scanner;
public class EqualityChecker2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int counter = 0;
		int numbers =0;
		while(numbers != -1){
		System.out.println("Enter Number or -1 to exit :");
		 numbers = scanner.nextInt();
			counter = counter + 1;
	if(numbers == numbers && numbers == numbers && numbers != -1){
			System.out.println(" All Numbers are Equal ");
		}
	
		else {
			System.out.print("All Numbers are not Equal");
		}
		
		
		}
	}
}