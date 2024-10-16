/**
		pseudocode
step 1:
1. prompt and collect the length of each sides the equilateral triangle
2. calculate the area of the triangle
3. calculate the volume of the triangle 
4. display the result.

step 2:
1. prompt the user to Enter a length of the equilateral triangle 
2. collect the number
3. store as length
4. calculate the Area = (1.7320508/4)*(length of sides*length of sides)
5. calculate the volume = area * length 
6. Display the volume
7. Display the area

*/

import java.util.Scanner;
public class Triangle{
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the equilateral triangle :");
		  double length = input.nextDouble();
		  double area = (1.7320508/4)*(length*length);
		  double volume = area * length;
		System.out.printf("The Area is %.2f%n:", area );
		System.out.printf("The Volume of the triangiler prisim is %.2f%n:", volume );  
	}
}