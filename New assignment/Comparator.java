import java.util.Scanner;
public class Comparator{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
 	
		System.out.print("Enter firstnumber : ");
		int firstnumber = input.nextInt();
		System.out.print("Enter secondnumber : ");
		int secondnumber = input.nextInt();
		if (firstnumber == secondnumber){
			System.out.print("0");
		}
		else if (firstnumber > secondnumber ){
			System.out.print("1");
		}
		else{
			System.out.print("-1");

		}

	}
}