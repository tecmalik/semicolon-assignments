import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormart;
public class CompoundIntrestCalculator{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	//BigdDecimal bigdecimal = new BigDecimal("12345");
	
	System.out.print(" Initial Investment * ");
	System.out.print("Amount of money that you have available to invest instantlly. ");
	double initialInvestment = input.nextDouble();
	
	System.out.print("Monthly Constribution ");
	System.out.print("Amount that you plan to add to the principal every month,or a nagative \n number for the amount that you plan to withdraw envry month.");
	int monthlyContribution = input.nextInt();
	
	System.out.print("Length of Tume in Years *");
	System.out.print("Length of time, in years, that you plan to save");
	int LengthInYears = input.nextInt();
	
	System.out.print("Estimated Intrest Rate *");
	System.out.print("Your estimated annual intrest rate");
	int estimatesIntrestRate = input.nextInt();
	double intrestRate = (double)estimatesIntrestRate /100 ;

	System.out.print("Intrest rate Varience range");
	System.out.print("Range of interest rate(above and beliow the rate set above) that you desire to see results for.");
	int intrestRateVarianceRange = input.nextInt();
	
	System.out.print("compound Frequency");
	System.out.print(" Times per year that intrest will be compounded");
	int compoundFrequency = input.nextInt();
	
	compoundIntrestAmount = initialInvestment(1 + (((double)estimatesIntrestRate /100)/LengthInYears))
	
	}
	
}