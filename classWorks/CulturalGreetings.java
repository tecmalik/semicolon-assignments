import java.util.Scanner;
public class CulturalGreetings{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.print(" Can i greet ?");
		
		System.out.print(" please choose an option :\n1. English \n2. Yoruba \n3. igbo \n Enter number :");
		int reply = input.nextInt();
		
		switch (reply){
		case 1:
			System.out.print(" hello then ....!!!  ");
		break;
		case 2:
			System.out.print(" bawoni paddy mi ");
		break;
		case 3:
			System.out.print(" otutu woma ");
			break;
		}
		
		
	}		
}