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
	
	public static void addToCart(){
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
	public static void removeFromCart(){
		System.out.print("enter Contact first Name : ");
		String removeFirstName = input.nextLine();
		System.out.print("enter Contact Last Name : ");
		String removeLastName = input.nextLine();

		for(int index = 0; index<contactFirstNames.length ; index++){
			if(removeFirstName.equalsIgnoreCase(contactFirstNames[index]) && removeFirstName.equalsIgnoreCase(contactFirstNames[index])){
				contactFirstNames.remove(contactFirstNames[index]);
				contactLastNames.remove(contactLastNames[index]);
				phoneNumbers.remove(phoneNumbers[index]);
				contactAdresses.remove(contactAdresses[index]);
				contactEmails.remove(contactEmails[index]); 
			System.out.printf("you removed %s %s from contact",removeFirstName,removeLastName);
			}
			else{ 
			System.out.print("invalid input !!!");
			removeFromCart();
			}
	
	
		}
	
	}











}