import java.util.Scanner;
public class TurtleGraphics{
		
	static Scanner input = new Scanner(System.in);
	static int runningProgram = 0;

	public static void main(String[] args){
		int[][] floor = new int[20][20];
		
		while (runningProgram != 9){
			
			action(commandMenu());		}
		
	
	}


	public static int commandMenu(){
		System.out.print("1. Pen up.\n2. Pen down.\n3. Turn right.\n4. Turn left \n5,10. Moving foward 10 spaces(replace 20 doe diffrent number of spaces).\n6. DIsplay the 20-by-20 array.\n9. End of data(sentinel) \nEnter Choice :");
		int userChoice = input.nextInt();
	return userChoice;

	}

	public static void action(int commandMenu){
		if (commandMenu == 1){
			
			penUp();
			action(commandMenu());	
		}
		else if (commandMenu == 2){
			
		}
		else if (commandMenu == 3){
			
		}

		else if (commandMenu == 4){
			
		}

		else if (commandMenu == 5 ){
		
		}
		else if (commandMenu == 10){
			
		}

		else if (commandMenu == 6 ){
			
		}
		else if (commandMenu == 9){
			runningProgram = 9;
		}


	}

	public static void penUp(){
		
	
	}
	


			
}