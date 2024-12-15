import java.util.Scanner;
public class Diary{ 
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("1.Add Entry\n2. Create Diary\n3. Update entry\n4. find by Id\n5. Unlock Diary\6. Lock Diary\n7. Delete Entry ");
	
	
	}
	
	public static setpassword(){
		System.out.print("Enter a new password : ");
		String firstInput = input.next(); 
		System.out.print("Enter password again: ");
		String. secondInput = input.next(); 
		if (firstInput.equals(secondInput)){
			String actualPassword = firstInput;
		}else{
			System.out.print("password does not match !!!\n try Again. ");
			 setpassword();
		}
	}

	public static void Create Diary(){
		System.out.print("Enter Title : ");
		String title = input.nextLine();
		System.out.print("Enter Date in \"yy/mm/dd\" :  ");
		String date = iniput.nextline()
		System.out.print("Enter text");
	}	
	
	public static void main unlockDiary(){
		
		System.out.print("Enter password : ");
		String userPassword = inpuut.next();
		if (userpassword.equals(actualPassword) ){
		
		}else{
			System.out.print("invalid passWord");
		}
	}

	
}