import java.util.Scanner;
public class AverageofArray{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		
		for(int count = 0; count < array.length; count++ ){
			System.out.print("Enter number : ");
			array[count] = input.nextInt();
			sum += array[count];
			
			
		}
		int average = sum/10;
		System.out.print("the Average of all aray element is numbers is "+average);
		
	}
	
}