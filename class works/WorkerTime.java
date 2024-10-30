import java.util.Scanner;
public class WorkerTime{
	public static void main(String[]  args){
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter the number of time of efficiency :");
		int timeOfEfficiency = input.nextInt();
		
		if (timeOfEfficiency <= 3){
			System.out.println("worker is highly effective");
		}
		if (timeOfEfficiency > 3 && timeOfEfficiency <= 4){
			System.out.println("Improve in your Speed");
		}
		if (timeOfEfficiency > 4 && timeOfEfficiency <= 5){
			System.out.println("worker will be given training");
		}
		if (timeOfEfficiency > 5){
			System.out.println("worker has to leave the company");
		}


		
	}
}