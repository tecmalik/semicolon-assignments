import java.util.Scanner;
public class TrianglePattern{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the base of a triangle : ");
		int baseNumber = input.nextInt();
		for(int size = 1; size <= baseNumber; size++){
		System.out.println("");
			for(int pattern = 1; pattern < size ; pattern++){
				System.out.print("*");
			}
		}
 		
	}
}