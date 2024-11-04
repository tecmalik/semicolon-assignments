import java.util.Scanner;
public class Numberpattern{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		 
		for(int size = 1; size<=5; size++){
			
			for(int pattern = 1 ; pattern<size ; pattern++){
				System.out.print("*");
			}
			System.out.println("");
		 }
		for(int size = 1; size<=5; size++){
	 
			for(int pattern = 1 ; pattern<7-size; pattern++){
				System.out.print("*");
			}
			 System.out.println("");

		}
		
		for(int size = 1; size<=5; size++){
			
			for(int pattern = 1 ; pattern<size ; pattern++){
				System.out.print(pattern);
			}
			System.out.println("");
		 }
		for(int size = 1; size<=5; size++){
	 
			for(int pattern = 1 ; pattern<7-size; pattern++){
				System.out.print(pattern);
			}
			 System.out.println("");

		}

	}
}