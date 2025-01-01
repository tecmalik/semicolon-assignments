import java.util.Scanner;

public class CompoundIntrestCalculator{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println(" Initial Investment * ");
	System.out.println("Amount of money that you have available to invest instantlly. ");
	double initialInvestment = input.nextDouble();
	
	System.out.println("Monthly Constribution ");
	System.out.println("Amount that you plan to add to the principal every month,or a nagative \n number for the amount that you plan to withdraw every month.");
	int monthlyContribution = input.nextInt();
	
	System.out.println("Length of Tume in Years *");
	System.out.println("Length of time, in years, that you plan to save");
	int lengthInYears = input.nextInt();
	
	System.out.println("Estimated Intrest Rate in % *");
	System.out.println("Your estimated annual intrest rate");
	double estimatesIntrestRate = input.nextDouble();

	System.out.println("Intrest rate Varience range");
	System.out.println("Range of interest rate(above and beliow the rate set above) that you desire to see results for.");
	int intrestRateVarianceRange = input.nextInt();
	
	System.out.println("compound Frequency");
	System.out.println(" Times per year that intrest will be compounded");
	int compoundFrequency = input.nextInt();
	
	if (monthlyContribution == 0){
	
		double compoundIntrestAmount = initialInvestment * (Math.pow((1 + ((estimatesIntrestRate /100)/lengthInYears)), lengthInYears*compoundFrequency )) - initialInvestment;
		System.out.printf("your calculated compound Intrest Amount is %.2f",compoundIntrestAmount);
	}
	else{
		
		double compoundIntrestAmount = initialInvestment * (Math.pow((1 + ((estimatesIntrestRate /100)/lengthInYears)), lengthInYears*compoundFrequency )) + monthlyContribution(((Math.pow((1 + ((estimatesIntrestRate /100)/lengthInYears), lengthInYears*compoundFrequency ))-1)/((estimatesIntrestRate /100)/lengthInYears)));
		System.out.printf("your calculated compound Intrest Amount is %.2f",compoundIntrestAmount);
	}
	
	
	}
	
}