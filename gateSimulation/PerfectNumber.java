import java.util.Scanner;
public class PerfectNumber{
	public static void main(String[] args ){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int number = input.nextInt();
		int factor = 1;
		int factorsum = 0;
		while(factor != number){
			if(number%factor == 0){
				factorsum += factor;
				
			}
			factor++;
		}
		int totalsumoffactors = factorsum + number;
		int sum_of_itself = number+number;
		System.out.println("the sum of "+number+" factors is "+totalsumoffactors);
		System.out.println("the sum of itself is "+sum_of_itself);
		if (totalsumoffactors == sum_of_itself){
			System.out.println(" it is a perfect number ");
		} 

	}
}
