import java.util.Scanner;
public class Diary{ 

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		
	System.out.print("welcome to My Diary App");
	System.out.print("Enter username : ");
	String userName = input.next();
	System.out.print("password : ");
	String userpassword = input.next();
	}
	public static void menu(){ 
	System.out.print("1.Add Entry\n2. Create Diary\n3. Update entry\n4. find by Id\n5. Unlock Diary\6. Lock Diary\n7. Delete \n Entry Enter a number :");
	int userSelection = input.nextint();
	if (userSelection == 1){}
	
	
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
		
	}
	public static void deleteEntry(){
		
	}
	public static void updateEntry(){
		
	}
	



}