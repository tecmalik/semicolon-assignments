/**
pseudocode:
1. prompth user to Enter three points respectively (x1, y1), (x2, y2), (x3, y3) of a triangle  
2. get the numbers
store the numbers as respectively  X1,y1,x2,y2,x3,y3
3. calculate side1 = squareroot of( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1) )
4. store as side1
5. calculate side2 = squareroot of ( (x3-x2)*(x3-x2)+(y3-y2)*(y3-y2) )
6. store as side2
7. calculate side3 = squareroot of ( (x3-x1)*(x3-x1)+(y3-y1)*(y3-y1) )
8. store as side3
9. calculate the semiperimeter = (side1 + side2 + side3 ) / 2
10. store as semiperimeter
11. calculate the area = squareroot of ( semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3) )
12. store as area
13. display area

*/
import java.util.Scanner;
public class Geometry{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.print(" Enter three points (x1, y1), (x2, y2), (x3, y3) of a triangle :");
			System.out.println(" Enter the value for x1 :");
			   double x1 = input.nextDouble();
			System.out.println(" Enter the value for y1 :");
			   double y1 = input.nextDouble();
			System.out.println(" Enter the value for x2 :");
			   double x2 = input.nextDouble();
			System.out.println(" Enter the value for y2 :");
			   double y2 = input.nextDouble();
			System.out.println(" Enter the value for x3 :");
			   double x3 = input.nextDouble();
			System.out.println(" Enter the value for y3 :");
			   double y3 = input.nextDouble();
				double side1 = Math.sqrt( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1) );
				double side2 = Math.sqrt( (x3-x2)*(x3-x2)+(y3-y2)*(y3-y2) );
				double side3 = Math.sqrt( (x3-x1)*(x3-x1)+(y3-y1)*(y3-y1) );
			     double semiperimeter = (side1 + side2 + side3 ) / 2 ;
			double area = Math.sqrt( semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3) );
			System.out.printf("The area of the triangle is %.1f%n", area);

	}
}