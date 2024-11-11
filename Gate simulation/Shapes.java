import java.util.Scanner;
public class Shapes{
	public static void main(String[] args ){
	
		Scanner input = new Scanner(System.in);
		
		
			System.out.println(" calculate the Area of a \n1. circle \n2. Triangle   \n3. Rectangle   ");
			System.out.println(" Enter your number:");
			int shape = input.nextInt();
			switch(shape){
			
			case 1 :
				System.out.println(" circle  \n1. find the Radius; \n2.  find the Area   ");
				System.out.println("Enter choice:");
				int circle = input.nextInt();

				switch(circle){
			
					case 1 :
						System.out.println(" enter the Area of a circle  ");
						float area0 = input.nextFloat();
						float pie1 = 22/7;
						float radius =  (float)Math.sqrt(area0/(2*pie1));
						
						System.out.println(" the radius is "+ radius);
					break;
					case 2 :
						System.out.println(" enter the radius of a circle");
						float radius2 = input.nextFloat();
						float pie2 = 22/7;
						float area = 2 *pie2* (radius2*radius2);
						System.out.println("The Area of a circle is" +area);
					
					default: 
					System.out.println("invalid input");
					}

			break;
			case 2 :
				System.out.println("triangle \n1.area  \n2. length   \n3. weight  ");
				System.out.println("Enter number :");
				int triangle = input.nextInt();
				switch(triangle){
			
					case 1 :
						System.out.println("Enter the base of a triangle ");
						float base = input.nextFloat();
						System.out.println("Enter the hight of a triangle ");
						float hight = input.nextFloat();

						float area3 = (1/2)* base * hight;
						System.out.println("the area of a triangle is "+ area3);

					break;
					case 2 :
						System.out.println("enter the area of a triangle  ");
						float area4 = input.nextFloat();
					

					break;
					case 3 :
						System.out.println(" ");
					
					break;
					
					default: 
					System.out.println("invalid input");
					}



			break;
			case 3 :
				System.out.println(" rectriangle \n1.area  \n2. length   \n3. weight   ");
				System.out.println("Enter number : ");
				int shake = input.nextInt();
				switch(shake){
			
					case 1 :
						System.out.println("");
					break;
					case 2 :
						System.out.println("");
					break;
					case 3 :
						System.out.println(" ");
					break;
					

					default: 
					System.out.println("invalid input");
					}



			default: 
				System.out.println("invalid input");
			}
	}
}
