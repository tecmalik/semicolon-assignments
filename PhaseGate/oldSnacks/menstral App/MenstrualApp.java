import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualApp{

	static Scanner input = new Scanner(System.in);
	 
	public static void main(String[] args){
		
		printOut("Enter your name :");
		String username = input.nextLine();
		printLine();
		
		printOut("welcome to the Menstrual app ");
		printLine();
		
		gender();
		
		

	}
	public static void printLine(){
		System.out.println();	
	}
	public static void printOut(String texts ){
		System.out.print(texts);
	}
	public static void femalesPlan(){
		
		printOut("Enter your Age :");
		printLine();
		int userAge = input.nextInt();
		printOut("Enter the length of your cycle e.g 28/27 days: ");
		printLine();
		int cyclelength = input.nextInt();
		printOut("Enter period duration:\n e.g 4/7 ");
		int periodDuration = input.nextInt();
		printLine();
		printOut("Enter the date of the first day of your last period using \"yyyy-mm-dd\" format : ");
		String lastPeriodDate = input.nextLine();
		printLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate lastDate = LocalDate.parse(lastPeriodDate, formatter);	
		LocalDate nextPeriodStart = lastDate.plusDays(cyclelength); 
		
		LocalDate nextLastDayofBleeding = nextPeriodStart.plusDays(periodDuration);
		
		LocalDate nextEndofCycleDate =  nextPeriodStart.plusDays(cyclelength+1);
		LocalDate nextOvulationDate =  nextEndofCycleDate.minusDays(14);
		LocalDate safePeriod3 = nextOvulationDate.plusDays(1);
		LocalDate safePeriod4 = nextOvulationDate.plusDays(7);
		LocalDate safeperiod1 = nextLastDayofBleeding.plusDays(1);
		LocalDate safeperiod2 = nextLastDayofBleeding.plusDays(7);
		
		printOut(" your next End of Cycle Date"+nextEndofCycleDate);
		printOut(" your next Last Day of Bleeding"+nextLastDayofBleeding);	
		printOut(" your next Period starts on "+ nextPeriodStart);
		printOut(" your next end of cucledate Date is "+nextEndofCycleDate);
		printOut(" your next Safe Period before ovulation starts "+safeperiod1);
		printOut(" your next Safe Period before ovulation ends "+safeperiod2);
		printOut(" your next Ovulation date is "+nextOvulationDate);
		printOut(" your next Safe Period after ovulation starts "+ safePeriod3);
		printOut(" your next Safe Period after ovulation ends "+safePeriod4);
	
			
	}
	public static void gender(){
		printOut("Sellect Gender:   \n1. male \n2. female \n");
		printLine();
		int gender = input.nextInt();
		switch(gender){
		case 1 :
			isMale();
		break;
		case 2 :
			femalesPlan();
		break;
		
		default : 
			printOut("invalid input");
			printLine();
			gender();			

		}
	}
	public static void isMale(){
		
		printOut(" want to keep track \n1. with your partners period \n2. with your partner mood ?");
		int option = input.nextInt();
		switch(option){
		 
		case 1: 
			printOut("enter her code");
		break; 
		case 2:
			 printOut("enter her code");
		break;
	
		}
		
	}
	


}