import java.util.Scanner;
public class StandardLibrary2{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
	
		int daysNumber = 0;
		int counterNumber = 0;
		
		while (counterNumber < 3){
			
		System.out.println(" Enter number of days : ");
		 daysNumber = input.nextInt();
			++counterNumber;
		if ( daysNumber == 5 ){
			System.out.println(" pay 50 paise ");
		}
		else if ( daysNumber >= 6 &&  daysNumber <= 10 ){
			System.out.println(" Pay 1 rupees ");
		}
		
		else if ( daysNumber <5  ){
			System.out.println(" 0 Payment ");

		}
		else if ( daysNumber > 10 &&  daysNumber < 30 ){
			System.out.println(" Pay 5 rupees ");

		}

		else if (daysNumber > 30)
			{
			System.out.println(" membership will be Cancelled ");
		} 
		}

	}
}