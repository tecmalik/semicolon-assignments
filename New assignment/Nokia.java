import java.util.Scanner;
public class Nokia{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.print(" Nokia menu");
		
		System.out.printf("\n sellect an option : \n1. phone book \n2. messages \n3. chats \n4. call\n ");		
		System.out.print("Enter number :" );
		int menueList = input.nextInt();
				

		switch (menueList){
		case 1: 
			System.out.printf("\n Sellect next option \n1. search \n2. Services Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. send b'card \n8. Options \n9. speed dail \n10.Voice tags  ");
		break;
		case 2:
			System.out.print(" ");
			
		}
	}
}
