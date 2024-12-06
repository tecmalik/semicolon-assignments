import java.util.Scanner;
	public class CardValidator{

	static Scanner input = new Scanner(System.in);

	public static void main(String... args){
	
		System.out.print("Enter Credit-Card number : ");
		long cardNumber = input.nextLong();
		
		
			
	}
	
	public static boolean cardLength(long cardNumber){
		int numberlength = String.valueOf(cardNumber).length();
		
			if (counter<13 || counter>16){
				return false;
			}
		return true;
	}
}