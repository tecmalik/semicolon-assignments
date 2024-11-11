import java.util.Scanner;
public class SumofArray{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		
		for(int count = 0; count < array.length; count++ ){
			System.out.print("Enter number : ");
			array[count] = input.nextInt();
			sum += array[count];
			
			
		}
		System.out.print("the sum of all numbers is "+sum);
		
	}
	
}