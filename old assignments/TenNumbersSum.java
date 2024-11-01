import java.util.Scanner;
public class TenNumbersSum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int total = 0;
		int numberCounter=1;

		while(numberCounter < 11){
		
		System.out.print("enter "+ numberCounter+" numbers :");
		int firstNumber = input.nextInt();
		total = total + firstNumber;
		numberCounter++;
		}
		System.out.printf("the total is %d%n ", total);
	}
}