import java.util.Scanner;
public class palindromes{
	public static void main(String[] args){
	
		Scanner input= new Scanner(System.in);
		int number = 0;
		int counter = 0;
		int lastdigit = 0;
		System.out.print("Enter 5 digit number : "); 
		int firstnumber = input.nextInt();	
		int firstdigit = firstnumber % 10;
		while (counter<5){
		number = firstnumber/10;
		lastdigit = number % 10;
		counter++;
		}
		
		if (firstdigit == lastdigit){
			System.out.print("number is a palindrum");		}
		else if (number!= 0){
			System.out.print("number is not a palindrom or a five digit number");
		}
	}
}