import java.util.Scanner;
public class UserInfo{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your name : ");
	String name = input.nextLine();

	System.out.print("Enter your a number for sex : /n.1 for male /n.2 female");
	int sex = input.nextInt();
	System.out.print("Enter your Age : ");
	int age = input.nextInt();
	System.out.print("Enter your height : ");
	double height = input.nextDouble();

	if(sex == 1 && age >= 43 && height>  56){
	
	System.out.print(name+" you are eligible");
	}
	
	
	
	}
	
	
	
	
}