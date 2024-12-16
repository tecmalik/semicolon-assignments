import java.util.ArrayList;
import java.util.Scanner;
public class Diary{ 

	static Scanner input = new Scanner(System.in);
	ArrayList<String> diaryText = new ArrayList<String>();

	public static void main(String[] args){
		
	
		System.out.print("welcome to My Diary App");
		System.out.print("Enter username : ");
		String userName = input.next();
		System.out.print("password : ");
		String userpassword = input.next();
	}
	


	
	public static void menu(){ 
		System.out.print("1. find by Id \n2. Create Diary \n Entry Enter a number :");
		int userSelection = input.nextint();
		if (userSelection == 1){
		
		
		}
		else if (userSelection == 2){
		
		}
		else if (userSelection == 3){
		
		}
		else if (userSelection == 4){
		
		}
		else if (userSelection == 5){
		
		}
		else if (userSelection == 6){
		
		}
		else if(userSelection == 7){
		
	}else{
		System.out.print("invalid input");
		
	}
	}
	
	public static void setpassword(){
		System.out.print("Enter a new password : ");
		String firstInput = input.next(); 
		System.out.print("Enter password again: ");
		String secondInput = input.next(); 
		if (firstInput.equals(secondInput)){
			String actualPassword = firstInput;
		}else{
			System.out.print("password does not match !!!\n try Again. ");
			 setpassword();
		}
	}

	public static void createDiary(){
		System.out.print("Enter Title : ");
		String title = input.nextLine();
		System.out.print("Enter Date in \"yy/mm/dd\" : ");
		String date = input.nextLine();
		System.out.print("Enter text");
	}	
	
	public static void unlockDiary(String actualPassword){
		
		System.out.print("Enter password : ");
		String userPassword = input.next();
		if (userPassword.equals(actualPassword)){
			createDiary();
		}else{
			System.out.print("invalid passWord");
		}
	}


	public static void lockDiary(){
		System.out.print(" Diary locked ");	
	}
	
	public static void findByID(){
			
	} 

	public static void addEntry(){
		.add();
		
	}
	public static void deleteEntry(){
		.remove();
	}
	public static void updateEntry(){
		
	}
	



}