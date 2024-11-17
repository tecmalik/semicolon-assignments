import java.util.Scanner;
public class ReversedInput{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		int[] reversedInput = new int[5];
		
		for(int element= 0; element<reversedInput.length; element++){
			System.out.print(" Enter list numbers to be reversed : ");
			reversedInput[element] = scanner.nextInt(); 
			
		}
		for(int display = (reversedInput.length-1) ; display < reversedInput.length; display--){
			 System.out.print(reversedInput[display]+" , ");
		}
		
	}


}