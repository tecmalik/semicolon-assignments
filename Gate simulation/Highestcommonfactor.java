import java.util.Scanner;
public class Highestcommonfactor{
	public static void main(String[] args ){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First number : ");
		int firstNumber = input.nextInt();
		System.out.print("Enter First number : ");
		int secondNumber = input.nextInt();
		int factor = 1; 
		int count = 0;
		int hCF = 0;
		if (firstNumber > secondNumber){
		count = firstNumber;
		}
		else{
		 count = secondNumber;
		}
		
		while( factor < count){ 
			
			if( firstNumber%factor == 0 && secondNumber%factor == 0 ){  
				hCF = factor;
			}
			
			factor++;
		}
		System.out.print("the highest Common factor is "+ hCF);
	
	}
}
