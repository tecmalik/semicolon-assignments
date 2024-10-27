import java.util.Scanner;

public class AreaOfAPolugon{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a the number of sides on a polygon:");
		double nSidedPolygon = input.nextDouble();
		
		System.out.println("Enter a the length of the size :");
		double lengthOfPolygon = input.nextDouble();
		 double pi = 22/7;
		
		double area  = (nSidedPolygon *( lengthOfPolygon*lengthOfPolygon) )/(4 *Math.tan(pi/nSidedPolygon) );
		System.out.printf(" The Area is : %.4f%n" , area );
	}
}	