import java.util.Scanner;
public class ArrayIndexFinder{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int[] arrayindexs = {25,34,56,78,84,56,34,33,1,22,3,};
		System.out.print("Enter the index of number to be viewed : ");
		int userindex = input.nextInt();		
		
		System.out.print("Number at index "+userindex+" is "+arrayindexs[userindex]);
			
	}
		
	
}