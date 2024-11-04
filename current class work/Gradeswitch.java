import java.util.Scanner;
public class Gradeswitch{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		 
		
			System.out.println("Enter  \n1. 100    \n2. 70 \n3. 50   \n4. anyother grade");
			int grade = input.nextInt();
			switch(grade){	
			case 1:
				System.out.println("A");
			break;
			case 2: 
				System.out.println("B");
			break;
			case 3: 
				System.out.println("C");
			break;
			case 4: 
				System.out.println("well done  !!");
			break;
			}

	 
		
	}
}