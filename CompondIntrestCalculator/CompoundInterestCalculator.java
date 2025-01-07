import java.util.Scanner;

public class CompoundIntrestCalculator{
	
	static double initialInvestment;
	ststic int monthlyContributionl;
	ststic int lengthInYears;
	static double estimatesInterestRate;
	static int interestRateVarianceRange;
	static double initialInvestment;
	static int compoundFrequency;

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	try{

	System.out.println(" Initial Investment * ");
	System.out.println("Amount of money that you have available to invest instantly. ");
	System.out.print("Enter value : ");

	System.out.println(" Monthly Contribution ");
	System.out.println("Amount that you plan to add to the principal every month, or a negative \n number for the amount that you plan to withdraw every month.");
	System.out.print("Enter value : ");
	int monthlyContribution = input.nextInt();
	
	System.out.println(" Length of Time in Years *");
	System.out.println("Length of time, in years, that you plan to save");
	System.out.print("Enter value : ");
	int lengthInYears = input.nextInt();
	
	System.out.println(" Estimated Interest Rate in % *");
	System.out.println("Your estimated annual interest rate");
	System.out.print("Enter value : ");
	double estimatesInterestRate = input.nextDouble();

	System.out.println(" Interest rate Variance range");
	System.out.println("Range of interest rate(above and below the rate set above) that you desire to see results for.");
	System.out.print("Enter value : ");
	int interestRateVarianceRange = input.nextInt();
	
	System.out.println("compound Frequency");
	System.out.println("Times per year that interest will be compounded");
	int compoundFrequency = input.nextInt();
	
		if (monthlyContribution == 0){
	
			getCompoundInterest();
		}
		else{
		
			getCompoundInterestAmountWithMonthlyContribution();
		}
	}catch( ){
		System.out.print("");
	}
	
	
	}
	
	public static void getCompoundInterest(){
		double compoundInterestAmount = initialInvestment * (Math.pow((1 + ((estimatesInterestRate /100)/lengthInYears)), lengthInYears*compoundFrequency ));
		System.out.printf("your calculated compound Interest Amount is %.2f",compoundInterestAmount);
	
	}
	public static void getCompoundInterestAmount(){
		double compoundInterestAmount = initialInvestment * (Math.pow((1 + ( (estimatesInterestRate /100)/lengthInYears) ),lengthInYears*compoundFrequency )) + monthlyContribution * (((Math.pow((1 + ((estimatesInterestRate /100)/lengthInYears)), lengthInYears*compoundFrequency ))-1)/((estimatesInterestRate /100)/lengthInYears));
			System.out.printf("your calculated compound Interest Amount is %.2f",compoundInterestAmount);
	}

	
}