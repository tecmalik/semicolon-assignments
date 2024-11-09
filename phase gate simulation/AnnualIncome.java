import java.util.Scanner;
public class AnnualIncome{
	public static void main(String[] args ){
	
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter Annual income  :");
		int annualIncome = input.nextInt();
		double tax = 0;
		
		if(annualIncome < 9875 ){
			tax = (double)(annualIncome/100)*10;
			System.out.println("TAX RATE based on 10% is "+tax);
		}
		else if (annualIncome >= 9876 && annualIncome <=40125 ){
			tax = (double)(annualIncome/100)*12;
			System.out.println("TAX RATE is 12 % is "+tax);
		}
		else if (annualIncome >= 40126 && annualIncome <=185525 ){
			tax = (double)(annualIncome/100)*22;
			System.out.println("TAX RATE 22 % is "+tax );
		}

		else if (annualIncome >= 85525 ){
			tax = (annualIncome/100)*24;
			System.out.println("TAX RATE 24 % is "+tax );
		}
		



	
	}
}
