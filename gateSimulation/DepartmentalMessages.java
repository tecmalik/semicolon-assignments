import java.util.Scanner;
public class DepartmentalMessages{
	public static void main(String[] args ){
	
		Scanner input = new Scanner(System.in);
		
		
			System.out.println(" Select an option \n1. Information Technology department \n2. Human resource Department \n3. Finance Department  ");
			System.out.println(" Enter your Department :");
			int userDpartment = input.nextInt();
			switch(userDpartment){
			
			case 1 :
				System.out.println("Information Technology department \n1. Managers \n2. Analyst  \n3. intern ");
				System.out.println("Enter sub department :");
				int technologyDpartment = input.nextInt();

				switch(technologyDpartment){
			
					case 1 :
						System.out.println(" thanks for being the Managers for this department ");
					break;
					case 2 :
						System.out.println("thanks for being the Analyst for this department");
					break;
					case 3 :
						System.out.println("thanks for serving as an intern in this department");
					break;
					default: 
					System.out.println("invalid input");
					}

			break;
			case 2 :
				System.out.println("Human resource Department \n1. Managers \n2. Analyst  \n3. intern ");
				System.out.println("Enter sub department :");
				int humanResources = input.nextInt();
				switch(humanResources){
			
					case 1 :
						System.out.println(" thanks for being the Managers for this department ");
					break;
					case 2 :
						System.out.println("thanks for being the Analyst for this department");
					break;
					case 3 :
						System.out.println("thanks for serving as an intern in this department");
					break;
					default: 
					System.out.println("invalid input");
					}



			break;
			case 3 :
				System.out.println(" Finance Department \n1. Managers \n2. Analyst  \n3. intern ");
				System.out.println("Enter sub department : ");
				int finance = input.nextInt();
				switch(finance){
			
					case 1 :
						System.out.println(" thanks for being the Managers for this department ");
					break;
					case 2 :
						System.out.println("thanks for being the Analyst for this department");
					break;
					case 3 :
						System.out.println("thanks for serving as an intern in this department");
					break;
					default: 
					System.out.println("invalid input");
					}



			default: 
				System.out.println("invalid input");
			}
	}
}
