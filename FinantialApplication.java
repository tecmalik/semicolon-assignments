import java.util.Scanner;
public class FinantialApplication{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			
			System.out.print("Enter investment amount:");
			double investmentAmount = input.nextDouble();
			
			System.out.print("annual interest rate in percentage :");
			double annualIntrestRate = input.nextDouble();
			double rate = annualIntrestRate/100;
			
			double monthlyIntrestRate = rate/12;
			System.out.print("number of years:");
			double year = input.nextDouble();
			
			double accumulatedvalue =   investmentAmount *( Math.pow((1 + monthlyIntrestRate),12 * year)) ;
			System.out.printf(" The accumulated value is %.2f%n", accumulatedvalue);
			
	}
}