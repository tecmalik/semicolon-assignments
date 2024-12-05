import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBook{
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
	
	
	ArrayList<Integer> phoneNumbers = new ArrayList<Integer>();
	ArrayList<String> contactEmails = new ArrayList<String>();
	ArrayList<String> contactFirstNames = new ArrayList<String>();
	ArrayList<String> contactLastNames = new ArrayList<String>();
	ArrayList<String> contactAdresses = new ArrayList<String>();

	
		menu();

		
	
	}
	


	public static void menu(){
	System.out.print("SELLECT AN OPTION: \n1. Add Contact \n2. Remove Contact \n3. Find contact by phonenumber \n4. Find contact by lastname \n5. Edit contact by \nlast name \n6. Edit contact \n");
	int choice = input.nextInt(); 
		if(choice == 1){
			
		}
		else if(choice == 2){
			
			
			addToCart(contactFirstName,contactLastName,phoneNumber,contactAdress,contactEmail);
			menu();
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
	
	public static void addToCart( ){
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
			System.out.print("saved>>>>>>>>>>>>>>>");
	
			contactFirstNames.add(contactFirstName);
			contactLastNames.add(contactLastName);
			phoneNumbers.add(phoneNumber);
			contactAdresses.add(contactAdress);
			contactEmails.add(contactEmail); 
			System.out.printf("you Added %s to contact",contactFirstName);
	}
	public static void removeFromCart(int number()){
			
	
	
	
	}
	public Static void View(){
			System.out.print("you Added contactFirstNames.add(contactFirstName);
			contactLastNames.add(contactLastName);
			phoneNumbers.add(phoneNumber);
			contactAdresses.add(contactAdress);
			contactEmails.add(contactEmail); 
		
	
	}

	
}