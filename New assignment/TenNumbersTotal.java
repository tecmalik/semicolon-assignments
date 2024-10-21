import java.util.Scanner;
public class TenNumbersTotal{
	public static void main(String[] args){

		int total = 0;
		int digitCounter = 1;
		
		Scanner input = new Scanner(System.in);
			System.out.print("Enter 10 numbers");
		while (digitCounter <= 10){
			System.out.print("Enter number :");
			int typedNumber = input.nextInt();
		
			total = total + typedNumber;
			digitCounter =  digitCounter + 1;
		}
	
		System.out.printf("The total is %d%n" , total);
	}


}
