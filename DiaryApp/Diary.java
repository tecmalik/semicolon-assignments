import java.util.ArrayList;
import java.util.Scanner;
public class Diary{ 
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<ArrayList<String>> diaryID = new ArrayList<ArrayList<String>>();
	static ArrayList<String> diaryText = new ArrayList<String>();

	public static void main(String[] args){
		
	
		System.out.println("welcome to my Diary App");
		System.out.println(" ");
		menu();
	}
	


	
	public static void menu(){ 
		System.out.print("1. Find by Id \n2. Create Diary \n Enter number :");
		int userSelection = input.nextInt();
		if (userSelection == 1){
			findByID();
		}
		else if (userSelection == 2){
			ArrayList<String> createdDiary = createDiary();
			diaryID.add(createdDiary);
		}
		else{
		System.out.println("invalid input");
		
		}
	}
	

	public static void findByID(){
		System.out.print("Enter user Id : ");
		String userId = input.next();
		diaryID.contains(userId);
		for(int count = 0; count< diaryID.size() ; count++ ){
			if( diaryID.get(count).contains(userId) == true ){
				int textIndex = (unlockDiary());
				if (textIndex != -1){ 
					text(textIndex);
					break;
				}
				else{
					System.out.print("invalid passWord");
					unlockDiary();
				}
			}
			else{
				System.out.print("invalid user Id try again");
				findByID();
			}	
		}
	
	}


	public static void text(int index){
		if (index <= diaryText.size()){
			System.out.print(diaryText.get(index));
			textMenu();
		}
		else{
			System.out.println("Enter texts")
			String newText = input.nextLine();
			.add(newText) 
		}
			
	}
	
	public static Int textMenu(){
		System.out.print("Enter :\n1. to Add Entry\n2. To Delete Entry \n3. Update Entry \n-1. Exit ");
		int menuOption = input.nextInt();
		if( menuOption == -1){
			menu();
		}
		else if( menuOption == 1){
			addEntry();
		}
		else if( menuOption == 2){
			deleteEntry();
		}
		else if( menuOption == 3){
			updateEntry();
		}
		else{
			System.out.print("invalid input");
			textMenu();
		}
	}


	public static ArrayList<String> createDiary(){
		ArrayList<String> userinfo = new ArrayList<String>();
		System.out.println("Create a new user ID : ");
		String userName = input.nextLine();
		userinfo.add(userName);
		String password = setpassword();
		userinfo.add(password);
		System.out.println("Enter Date\n \"yy/mm/dd\" : ");
		String date = input.nextLine();
		userinfo.add(date);
		
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

	
	
	public static int unlockDiary(){
		int textIndex = 0;
		System.out.print("Enter your password : ");
		String userPassword = input.next();
		for(int count = 0; count<diaryID.size(); count++ ){
			if (userPassword.equals(diaryID.get(count).get(1))){
			textIndex = count;
			return textIndex;
			}
		}
		return -1;
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