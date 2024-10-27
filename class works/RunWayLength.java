import java.util.Scanner;

public class RunWayLength{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Speed:");
		double velocity = input.nextDouble();
		
		System.out.println("Enter the Acceleration:");
		double acceleration = input.nextDouble();
		
		double minimumRunwayLength = (velocity * velocity) /(2* acceleration);
		System.out.printf("The energy(Q) needed is %.3f%n", minimumRunwayLength);
	}
}	