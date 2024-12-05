import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBook{
	
	static Scanner input = new Scanner(System.in);
	
	static ArrayList<String> phoneNumbers = new ArrayList<String>();
	static ArrayList<String> contactEmails = new ArrayList<String>();
	static ArrayList<String> contactFirstNames = new ArrayList<String>();
	static ArrayList<String> contactLastNames = new ArrayList<String>();
	static ArrayList<String> contactAdresses = new ArrayList<String>();
	
	public static void main(String[] args){


		
		menu();

		
	
	}
	


	public static void menu(){
	System.out.println("SELLECT AN OPTION: \n1. Add Contact \n2. Remove Contact \n3. Find contact by phonenumber \n4. Find contact by lastname \n5. Edit contact by last name \n6. Edit contact \nEnter number :");
	int choice = input.nextInt(); 
		if(choice == 1){
			addToCart();
			menu();
		}
		else if(choice == 2){
			removeFromCart();
			menu();
		}
		else if(choice == 3){
			
		}
		else if(choice == 4){
			
		}

		else if(choice == 5){
			
		}
		else if(choice == 6){
			
		}




	}
	
	public static void addToCart(){
				input.nextLine();
			System.out.print("Enter First Name :");
			String contactFirstName  = input.nextLine();
			System.out.print("Enter Last Name :");
			String contactLastName  = input.nextLine();
			System.out.print("Enter Phone Number :");
			String phoneNumber = input.nextLine();
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
		
		display(contactFirstNames,contactLastNames,phoneNumbers,contactAdresses,contactEmails);

		System.out.println("enter a number to delete the Contact : ");
		int index = input.nextInt();
					
		if(index < contactFirstNames.size() && index > 0 ){
			
			contactFirstNames.remove(index);
			contactLastNames.remove(index);
			phoneNumbers.remove(index);
			contactAdresses.remove(index);
			contactEmails.remove(index); 
		display(contactFirstNames,contactLastNames,phoneNumbers,contactAdresses,contactEmails);
		}
		else{ 
		System.out.print("invalid input !!!");
		removeFromCart();
		}
	}
	public static void display(ArrayList<String> content1,ArrayList<String> content2,ArrayList<String> content3,ArrayList<String> content4,ArrayList<String> content5){
		System.out.printf("YOUR CONTACT LIST :);
		for(int count = 0; count < content1.size() ; count++){
			System.out.printf("%d %s %s %s%n%s%n%s%n", count+1,content1,content2,content3,content4,content5);
		}
	
	}
	











}