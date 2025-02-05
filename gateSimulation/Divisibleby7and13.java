import java.util.Scanner;
public class Divisibleby7and13{
	public static void main(String[] args ){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First number : ");
		int firstNumber = input.nextInt();
		
		System.out.print("Enter Second number greater than first number : ");
		int secondNumber = input.nextInt();
		String display = " ";
		 while(secondNumber <= firstNumber){
			System.out.print("Number must be greater than first number : ");
			secondNumber = input.nextInt();
		}
		
		while(firstNumber <= secondNumber ){
			
			if (firstNumber % 7 == 0 && firstNumber % 13 == 0 ){
				display += firstNumber +" " ;
			}
			
		firstNumber++;
		}
		
	
		if (display != " "){
		
		System.out.print(" The numbers divisible by 7 and 13 between "+(firstNumber-secondNumber)+" number and "+ secondNumber +" number are "+display);
		}
		else {
			System.out.print("no number beetween "+(firstNumber-secondNumber)+" and "+ secondNumber +" is divisible by 7&13  ");
		}

	
	}
}
