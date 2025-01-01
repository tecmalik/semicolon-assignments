import math

print(" Initial Investment * ");
print("Amount of money that you have available to invest instantly. ");
initialInvestment =int(input("Enter value : "));

print(" Monthly Contribution ");
print("Amount that you plan to add to the principal every month,or a negative \n number for the amount that you plan to withdraw every month.");
monthlyContribution =int(input("Enter value : "));
	
print(" Length of Time in Years *");
print("Length of time, in years, that you plan to save");
lengthInYears = int(input("Enter value : "));
	
print(" Estimated Interest Rate in % *");
print("Your estimated annual interest rate");
estimatesInterestRate = int(input("Enter value : "));

print(" Interest rate Variance range");
print("Range of interest rate(above and below the rate set above) that you desire to see results for.");
interestRateVarianceRange =int(input("Enter value : "));
	
print(" compound Frequency");
print("Times per year that interest will be compounded");
compoundFrequency = int(input("Enter value : "));
	
if monthlyContribution == 0:
	compoundInterestAmount = initialInvestment * (math.pow((1 + ((estimatesInterestRate /100)/lengthInYears)), lengthInYears*compoundFrequency )) - initialInvestment;
	print(f"your calculated compound Interest Amount is {round(compoundInterestAmount,2)}");

else:
		
	compoundInterestAmount = initialInvestment * (math.pow((1 + ( (estimatesInterestRate /100)/lengthInYears) ),lengthInYears*compoundFrequency )) + monthlyContribution * (((math.pow((1 + ((estimatesInterestRate /100)/lengthInYears)), lengthInYears*compoundFrequency ))-1)/((estimatesInterestRate /100)/lengthInYears));
	print(f"your calculated compound Interest Amount is {round(compoundInterestAmount,2)}");