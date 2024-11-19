import java.util.Scanner;
public class Perpendicular{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter the x-coordinate of the first point (x1):");
			float xone = input.nextfloat();
			System.out.print("Enter the y-coordinate of the first point (y1):");
			float yone = input.nextfloat();
			System.out.print("Enter the x-coordinate of the second point (x2):");
			float xtwo= input.nextfloat();
			System.out.print("Enter the y-coordinate of the second point (y2):");
			float ytwo = input.nextfloat();
		if (xone == xtwo ){
			System.out.print("The line is perpendicular to the x-axis.");
		}
		else if(yone == ytwo){
			System.out.print("he line is perpendicular to the y-axis.");
		}
		else {
			System.out.print("The line is not perpendicular to either axis.");
			}
			
	}
}