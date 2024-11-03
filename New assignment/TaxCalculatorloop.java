import java.util.Scanner;
public class TaxCalculatorloop{
	public static void main(String[] args){
	
		double firstTaxTotal = 0;
		double secondTaxTotal = 0;
		double thirdTaxTotal = 0;
		int counter = 0;
		while(counter < 3){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Citizens Name : ");
		String firstName = input.nextLine();
			counter++;
		System.out.println("Enter amount of anual earnings : ");
		double firstAmount = input.nextDouble();
		input.nextLine();
				
		if (firstAmount > 30_000){
			firstTaxTotal = firstAmount * 0.20;
		}
		else {
			firstTaxTotal = firstAmount * 0.15;

		}
				
		System.out.printf( "%s tax total is %.3f%n",firstName , firstTaxTotal);
		}
		
	}
}