import java.util.Scanner;
public class Instroctorsmap{
	public static void main(String[] args ){
	
		Scanner input = new Scanner(System.in);
		
		
			System.out.println(" Select an option \n1. Math's department \n2. science Department \n3. history Department  ");
			System.out.println(" Enter your Department :");
			int userDpartment = input.nextInt();
			switch(userDpartment){
			
			case 1 :
				System.out.println("Math's department \n1. freshman \n2. sophomore  \n3. junior \n4. senior ");
				System.out.println("Enter level :");
				int mathsDpartment = input.nextInt();

				switch(mathsDpartment){
			
					case 1 :
						System.out.println(" course instructor for fresh man is instructor david ");
					break;
					case 2 :
						System.out.println(" course instructor for sophomore is jane ");
					break;
					case 3 :
						System.out.println("course instructor for junior is micheal ");
					break;
					case 4 :
						System.out.println("course instructor for seniors is sam ");
					break;
					default: 
					System.out.println("invalid input");
					}

			break;
			case 2 :
				System.out.println("Science Department \n1. freshman \n2. sophomore  \n3. junior \n4. senior ");
				System.out.println("Enter sub department :");
				int science = input.nextInt();
				switch(science){
			
					case 1 :
						System.out.println(" course instructor for fresh man is instructor lammy ");
					break;
					case 2 :
						System.out.println("course instructor for sophomore is bibi");
					break;
					case 3 :
						System.out.println("course instructor for junior is  leke");
					
					break;
					case 4 :
						System.out.println("course instructor for seniors is tosin  ");
					break;

					default: 
					System.out.println("invalid input");
					}



			break;
			case 3 :
				System.out.println(" History Department \n1. freshman \n2. sophomore  \n3. junior \n4. senior ");
				System.out.println("Enter sub department : ");
				int history = input.nextInt();
				switch(history){
			
					case 1 :
						System.out.println(" course instructor for fresh man is instructor ayomide ");
					break;
					case 2 :
						System.out.println(" course instructor for sophomore is onyi ");
					break;
					case 3 :
						System.out.println(" course instructor for junior is  kazeem");
					break;
					case 4 :
						System.out.println("course instructor for seniors is james ");
					break;

					default: 
					System.out.println("invalid input");
					}



			default: 
				System.out.println("invalid input");
			}
	}
}
