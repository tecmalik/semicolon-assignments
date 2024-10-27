import java.util.Scanner;
public class CountFiveDigits{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			int negativeCounter = 0;
			int positiveCounter = 0;
			int zeroCounter = 0;
			int numberCounter = 1;
		
			
			System.out.print("Enter five numbers");
			int zeroNumbers = 0;
			int positiveNumbers = 0;
			int negativeNumbers = 0;
			
		while (numberCounter <= 5) {
			System.out.print("\nEnter number :");
			int newNumber = input.nextInt(); 
			 numberCounter = numberCounter +1 ;
			
		 	if (newNumber > 0) {
			positiveNumbers = ++positiveCounter;
			}
			else if (newNumber < 0){
			 negativeNumbers = ++negativeCounter;
			}  
			 if (newNumber == 0) {
			 zeroNumbers = ++zeroCounter;
			
			}
		}
			System.out.printf("The number of positive is %d%n" , positiveNumbers );
			System.out.printf("The negative number is %d%n" , negativeNumbers);
			System.out.printf("The number of zeros is %d%n" , zeroNumbers);
	}

}