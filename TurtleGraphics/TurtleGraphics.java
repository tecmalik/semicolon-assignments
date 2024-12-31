import java.util.Scanner;
public class TurtleGraphics{
		
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int[][] floor = new int[20][20];
		int userChoice = 0;
		while (userChoice != 9){
			
			 commandMenu();
			
		}
		
	
	}


	public static void commandMenu(){
		System.out.print("1. Pen up.\n2. Pen down.\n3. Turn right.\n4. Turn left \n5,10. Moving foward 10 spaces(replace 20 doe diffrent number of spaces).\n6. DIsplay the 20-by-20 array.\n9End of data(sentinel) ");
		int userChoice = input.nextInt();
		if (userChoice == 1){
			
		}
		if (userChoice == 2){
			
		}

	}

	public static void penUp(){
		
	
	}
	


			
}