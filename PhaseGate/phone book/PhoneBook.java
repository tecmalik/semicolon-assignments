import java.util.Arraylist;
import java.util.Scanner;
public class PhoneBook{
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
	
	
	ArrayList<Integer> phoneNumber = new ArrayList<Integer>();
	ArrayList<String> adress = new ArrayList<String>();
	ArrayList<String> contactName = new ArrayList<String>();
	ArrayList<String> emailAdress = new ArrayList<String>();

	
	
	
	 while(){
	
		menu(choice);
		
	
	}

		
	
	}
	


	public static int menu(choice){
	System.out.print("SELLECT AN OPTION: \n1. Add Contact \n2. Remove Contact \n3. Find contact by phonenumber \n4. Find contact by lastname \n5. Edit contact by \nlast name \n6. Edit contact \n");
	int choice = input.nextInt(); 
		if(choice == 1){
			
		}
		else if(choice == 2){
			System.out.print("Enter ContactName :");
			String contactName = input.nextLine();
			System.out.print("Enter ContactName :");
			int contactName = input.nextInt();
			
			addToCart(contactName,phonenumber,	);
		}
		else if(choice == 3){
			removeFromCart(contactToRemove);
		}
		else if(choice == 4){
			
		}

		else if(choice == 5){
			
		}
		else if(choice == 6){
			
		}




	}
	
	public static void addToCart(String name, int phoneNumber, String adress, String email){
	
		
	
	}
	public static void removeFromCart(contactToRemove){
	
	
	
	}


	
}