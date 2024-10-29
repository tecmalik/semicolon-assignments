import java.util.Scanner;
public class WorkerTime2{
	public static void main(String[]  args){
		Scanner input = new Scanner(System.in);
		
		int timeOfEfficiency = 0;
		int counter = 0;
	while(timeOfEfficiency != -1){
		System.out.println("Enter the time of efficiency or -1 to Exit:");
		 timeOfEfficiency = input.nextInt();
		
		if (timeOfEfficiency <= 3 && timeOfEfficiency != -1){
			System.out.println("worker is highly effective");
		}
		else if (timeOfEfficiency > 3 && timeOfEfficiency <= 4 && timeOfEfficiency != -1){
			System.out.println("Improve in your Speed");
		}
		else if (timeOfEfficiency > 4 && timeOfEfficiency <= 5 && timeOfEfficiency != -1){
			System.out.println("worker will be given training");
		}
		else if (timeOfEfficiency > 5 && timeOfEfficiency != -1){
			System.out.println("worker has to leave the company");
		}

	}
		
	}
}