import java.util.Scanner;
public class Frequency{
	public static void main(String[] args){

	Scanner input= new Scanner(System.in);
	System.out.print("how many numbers would you like to enter ?");
	int space = input.nextInt();
	int[] setOfNumbers = new int[space];
	int[] frequency = new int[50];
	
	for(int count=0; count<setOfNumbers.length; count++){
		System.out.println("Enter number between 1 and 50 : ");
		setOfNumbers[count]=input.nextInt();
		
		
		
	}
	
	System.out.printf("%s%10s%n","Rating","frequency");
	for(int display=0; display<setOfNumbers.length; display++){
		++frequency[setOfNumbers[display]]; 
			}
	for(int count =0; count< frequency.length ; count++){
		System.out.printf("%6d%10d%n", count , frequency[count]);
	}




	}


}