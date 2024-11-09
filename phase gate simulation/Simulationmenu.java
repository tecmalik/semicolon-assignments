import java.util.Scanner;
public class Highestcommonfactor{
	public static void main(String[] args ){
		
		Scanner input = new Scanner(System.in);
		String count = "";
		int number= 0;
	while(number != 4){
		System.out.println("basic menu : \n press 1 to Add \n press 2 to view \n press 3 to delete  \nAnd 4 to quit  ");
		System.out.println("Enter option : ");
		number = input.nextInt();
		if (number == 1){
			count+=1;
		System.out.println("you sellected : "+count);
			
		}
		else if (number == 2 ){
			count+=2;
		System.out.println("you sellected : "+count);
		}
		else if (number == 3){
		count = "cleared";
		System.out.println(count);
		}
		
	}
		
	
	}
}
