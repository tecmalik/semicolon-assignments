import java.util.Scanner;
public class positiveChecker{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int counter = 0; 
		
		while(counter < 3 ){
		System.out.println("Enter a number : ");
		int number = input.nextInt();
		counter+= 1;
			if (number > 0 && number != -1){
				System.out.println("number is a positive number");
			}
			else if (number < 0 && number != -1){
				System.out.println("number is a nagative number");
			}
			else if(number == 0 && number != -1){
				System.out.println("number is a zero");
			}
			else {
				System.out.println("Thank you.");
			}
			
		}
	}
		
}
