import java.util.Scanner;
public class DiscountRate{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Vehicles age : ");
		int vehiclesAge = input.nextInt();
		System.out.print("Enter your type of car ");
		String vehicleType = input.nextLine();
		System.out.print(" Enter number of times you have been here : ");
		int loyalty = input.nextInt();

		
		if(vehiclesAge <= 5){
			System.out.print(" 10% discount for " +vehicleType);
		}
		else if(vehiclesAge> 5  && vehiclesAge<10 ){
			System.out.print(" 5% discount for" +vehicleType);
		}
		else if(vehiclesAge > 10 ){
			System.out.print(" 5% discount for" +vehicleType);  
		}
		 if(loyalty > 1 ){
			System.out.print(" Additional 2% discount for You");

		}
		

	
	}
	
	
	
	
}