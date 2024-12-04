import java.util.Arraylist;
import java.util.Scanner;
public class PhoneBook{
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
	
	
	ArrayList<Integer> phoneNumbers = new ArrayList<Integer>();
	ArrayList<String> contactEmails = new ArrayList<String>();
	ArrayList<String> contactFirstNames = new ArrayList<String>();
	ArrayList<String> contactLastNames = new ArrayList<String>();
	ArrayList<String> contactAdresses = new ArrayList<String>();

	
	
	
	 while( ){
	
		menu(choice);
		
	
	}

		
	
	}
	


	public static int menu(choice){
	System.out.print("SELLECT AN OPTION: \n1. Add Contact \n2. Remove Contact \n3. Find contact by phonenumber \n4. Find contact by lastname \n5. Edit contact by \nlast name \n6. Edit contact \n");
	int choice = input.nextInt(); 
		if(choice == 1){
			
		}
		else if(choice == 2){
			System.out.print("Enter First Name :");
			String contactFirstName  = input.nextLine();
			System.out.print("Enter Last Name :");
			String contactLastName  = input.nextLine();
			System.out.print("Enter Phone Number :");
			int phoneNumber = input.nextInt();
			System.out.print("Enter Contact Adress :");
			String contactAdress = input.nextLine();
			System.out.print("Enter Contact Email :");
			String contactEmail = input.nextLine();
			
			addToCart(contactFirstName,contactLastName,phoneNumber,contactAdress,contactEmail);
		}
		else if(choice == 3){
			removeFromCart();
		}
		else if(choice == 4){
			
		}

		else if(choice == 5){
			
		}
		else if(choice == 6){
			
		}




	}
	
	public static void addToCart(String contactFirstName,String contactLastName,int phoneNumber,String contactAdress,String contactEmail){
	
		
			contactFirstNames.add(contactFirstName);
			contactLastNames.add(contactLastName);
			phoneNumbers.add(phoneNumber);
			contactAdresses.add(String contactAdress);
			contactEmails.add(String contactEmail); 
			
			
	
	}
	public static void removeFromCart(contactToRemove){
	
	
	
	}


	
}