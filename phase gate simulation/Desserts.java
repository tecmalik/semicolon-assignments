import java.util.Scanner;
public class Desserts{
	public static void main(String[] args ){
	
		Scanner input = new Scanner(System.in);
		
		
			System.out.println(" Select an option \n1. ice cream  \n2. sundae  \n3.  shake   ");
			System.out.println(" Enter your choice of dessert :");
			int userchoice = input.nextInt();
			switch(userchoice){
			
			case 1 :
				System.out.println("ice cream  \n1.chocolate \n2.  vanilla   \n3. strawberry   ");
				System.out.println("Enter dessert :");
				int icecream = input.nextInt();

				switch(icecream){
			
					case 1 :
						System.out.println(" chocolate icecream ");
					break;
					case 2 :
						System.out.println(" vanilla icecream");
					break;
					case 3 :
						System.out.println("  strawberry icecream ");
					break;
					
					default: 
					System.out.println("invalid input");
					}

			break;
			case 2 :
				System.out.println("sundae  \n1.chocolate \n2.  vanilla   \n3. strawberry  ");
				System.out.println("Enter sub department :");
				int sundea = input.nextInt();
				switch(sundea){
			
					case 1 :
						System.out.println("  chocolate sundea  ");
					break;
					case 2 :
						System.out.println("  vanilla sundea ");
					break;
					case 3 :
						System.out.println(" strawberry sundea");
					
					break;
					
					default: 
					System.out.println("invalid input");
					}



			break;
			case 3 :
				System.out.println(" choice of shake  \n1.chocolate \n2.  vanilla   \n3. strawberry  ");
				System.out.println("Enter sub department : ");
				int shake = input.nextInt();
				switch(shake){
			
					case 1 :
						System.out.println("chocolate shake");
					break;
					case 2 :
						System.out.println(" vanilla shake");
					break;
					case 3 :
						System.out.println(" strawberry  shake");
					break;
					

					default: 
					System.out.println("invalid input");
					}



			default: 
				System.out.println("invalid input");
			}
	}
}
