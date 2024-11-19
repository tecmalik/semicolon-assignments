import java.util.Scanner;
public class GasMileage{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int milesdriven = 0;
		float milespergallon = 0;
 		while (milesdriven != -1 ){
			System.out.print("Enter the miles driven or -1 t0 exit : ");
			milesdriven = input.nextInt();
			System.out.print("Enter the number of gallons used or -1 t0 exit : ");
			int numberOfgallons = input.nextInt();
			
			milespergallon = (float)milesdriven / (float)numberOfgallons;
			System.out.printf("the miles per gallon is %f%n" ,milespergallon);
						
		}
		
	
	}
}