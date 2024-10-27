import java.util.Scanner;
public class TaxCalculator{
	public static void main(String[] args){
	
		double firstTaxTotal = 0;
		double secondTaxTotal = 0;
		double thirdTaxTotal = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Citizens Name : ");
		String firstName = input.nextLine();
		
		System.out.println("Enter amount of anual earnings : ");
		double firstAmount = input.nextDouble();
		input.nextLine();
		System.out.println("Enter Second Citizens Name : ");
		String secondName = input.nextLine();
		
		System.out.println("Enter Second Citizens amount of anual earnings : ");
		double secondAmount = input.nextDouble();
		input.nextLine();
		System.out.println("Enter Third Citizens Name : ");
		String thirdName = input.nextLine();
		
		System.out.println("Enter Third Citizens amount of anual earnings : ");
		double thirdAmount = input.nextDouble();
		
		if (firstAmount > 30_000){
			firstTaxTotal = firstAmount * 0.20;
		}
		else {
			firstTaxTotal = firstAmount * 0.15;

		}
		if (secondAmount > 30_000){
			secondTaxTotal = secondAmount * 0.20;
		}
		else {
			secondTaxTotal = secondAmount * 0.15;

		}

		 if (thirdAmount > 30_000){
			thirdTaxTotal = thirdAmount * 0.20;
		}
		else {
			thirdTaxTotal = thirdAmount * 0.15;

		}
		System.out.printf( "%s tax total is %.3f%n",firstName , firstTaxTotal);
		System.out.printf( "%s tax total is %.3f%n",secondName, secondTaxTotal);
		System.out.printf( "%s tax total is %.3f%n",thirdName, thirdTaxTotal);
	}
}