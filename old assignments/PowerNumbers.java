import java.util.Scanner;
public class PowerNumbers{
	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);
			
			int multiple = 1;
			int counterNumber = 1;
				System.out.print("Enter first number:");
				int firstNumber = input.nextInt();
				System.out.print("Enter first number:");
				int secondNumber = input.nextInt();
			while (counterNumber <= firstNumber ){ 
				
				multiple *=  secondNumber ;
				counterNumber = counterNumber +	1;
				
				}
			System.out.printf(" The multiple is %d%n" , multiple);
	}
}						