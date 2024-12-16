import java.util.ArrayList;
import java.util.Scanner;
public class Diary{ 

	static Scanner input = new Scanner(System.in);
	ArrayList<String> diaryText = new ArrayList<String>();

	public static void main(String[] args){
		
	
		System.out.println("welcome to My Diary App");
		System.out.println(" ");
		menu();
	}
	


	
	public static void menu(){ 
		System.out.println("1. Find by Id \n2. Create Diary \n Enter your option number :");
		int userSelection = input.nextInt();
		if (userSelection == 1){
			findByID();
		}
		else if (userSelection == 2){
			createDiary();
		}
		else{
		System.out.println("invalid input");
		
		}
	}
	

	public static void findByID(){
		String enteredID ;
	
	}
	public static ArrayList<String> createDiary(){
		ArrayList<String> userinfo = new ArrayList<String>();
		System.out.println("Create a new user ID : ");
		String userName = input.nextLine();
		userinfo.add(userName);
		System.out.println("Enter Date\n \"yy/mm/dd\" : ");
		String date = input.nextLine();
		String password = setpassword();
		userinfo.add(password);
		
		return userinfo; 
	} 

	public static String setpassword(){
		System.out.println("Enter a new password : ");
		String firstInput = input.next(); 
		System.out.println("re-enter password again: ");
		String secondInput = input.next(); 
		String actualPassword = "";
		if (firstInput.equals(secondInput)){
			actualPassword = firstInput;
		}else{
			System.out.println("password does not match !!!\n try Again. ");
			 setpassword();
		}
		return actualPassword;
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
	


	public static void addEntry(){
		//.add();
		
	}
	public static void deleteEntry(){
		//.remove();
	}
	public static void updateEntry(){
		
	}
	



}