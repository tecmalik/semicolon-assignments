import java.util.Scanner;
public class TimesTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int numberCounter = 0;
		int product = 0;
		int count = -1;
		
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		
		while(numberCounter <= number){
			
			product = number * numberCounter ;
			count = count + 1;
			numberCounter++;
			System.out.println(number+" x "+ count +" = "+ product+" ");
		}
	}
}
