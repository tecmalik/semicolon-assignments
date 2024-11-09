import java.util.Scanner;
public class TempratureRange{
	public static void main(String[] args ){
	
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter Temprature :");
		int tempratureRange = input.nextInt();
		
		if(tempratureRange < 10 ){
		System.out.println("Cold");
		}
		else if (tempratureRange >= 10 && tempratureRange <=25 ){
		System.out.println("Warm");
		}
		else if (tempratureRange > 25 ){
		System.out.println("Hot");
		}
		



	
	}
}
