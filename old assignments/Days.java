import java.util.Scanner;
public class Days{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.print("enter a  netween number 1 and 7 :");
		int day= input.nextInt();
		
		if ( day == 1 ){
			System.out.println(" Monday ");
				}
		if ( day == 2 ){
			System.out.println(" Tuesday ");
				}

		if ( day == 3 ){
			System.out.println(" Wednesday ");
				}

		if ( day == 4 ){
			System.out.println(" Tursday ");
				}

		if ( day == 5 ){
			System.out.println(" Friday ");
				}

		if ( day == 6 ){
			System.out.println(" Saturday ");
				}

		if ( day ==7 ){
			System.out.println(" Sunday ");
				}

		
	}
}