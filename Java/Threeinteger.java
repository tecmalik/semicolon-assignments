/** 
puseducode:
step1
1. prompt the user to input 3 integers
2. calculate the average 
3. clculate the product
4. calculate the sum 
5. checkbfor the largest number 
6. check for the lowest number
7. display results

step 2:
1. prompt the user to enter the first integer
2. collect the number 
3. store the number as firstinteger
4. p rompt the user to enter a second integer
5. collect the number 
6. store the number as secondinteger
7. prompt the user to enter a third integer 
8. collect the number 
9. store the number as thirdinteger
10. calculate sum = firstinteger + secondinteger + thirdinteger
11. calculate product = firstinteger * secondinteger * thirdinteger
12. calculate average = (firstinteger + secondinteger + thirdinteger)/3
14. display the sum
15. display the product
16. display the average
17. if firstInteger>secondInteger & thirdInteger display firstinteger is the largest number
18. if secondInteger>firstInteger & thirdInteger display secondinteger is the largest number
19. if thirdInteger > firstInteger & secondInteger display thirdinteger is the largest number 
20. if firstInteger<secondInteger & thirdInteger display firstinteger is the smallest number
21. if secondInteger<firstInteger & thirdInteger display secondinteger is the smallest number
22. if thirdInteger < firstInteger & secondInteger display thirdinteger is the smallest number

*/





import java.util.Scanner;
public class Threeinteger{
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer :");
		 int firstInteger = input.nextInt();
		System.out.print("Enter second integer :");
		 int secondInteger = input.nextInt();
		System.out.print("Enter third integer :");
		 int thirdInteger = input.nextInt();
		int sum = firstInteger + secondInteger + thirdInteger;
		int average = (firstInteger + secondInteger + thirdInteger)/3;
		int product = firstInteger * secondInteger * thirdInteger;
		System.out.printf("product is %d%n" , product);
		System.out.printf("the sum is %d%n" , sum );
		System.out.printf("the average is %d%n" , average); 		  
 if (firstInteger>secondInteger && firstInteger>thirdInteger){
			System.out.printf(" this is the largest number :%d%n" , firstInteger);
		   }
		    if (secondInteger>firstInteger && secondInteger>thirdInteger){
			System.out.printf(" this is the largest number :%d%n" , secondInteger);
		   }
                     if (thirdInteger > firstInteger && thirdInteger > secondInteger){
			System.out.printf(" this is the largest number :%d%n" , thirdInteger);
		   }
if (firstInteger<secondInteger && firstInteger<thirdInteger){
			System.out.printf(" this is the smallest number :%d%n" , firstInteger);
		   }
		    if (secondInteger<firstInteger && secondInteger<thirdInteger){
			System.out.printf(" this is the smallest number :%d%n" , secondInteger);
		   }
                     if (thirdInteger < firstInteger && thirdInteger < secondInteger){
			System.out.printf(" this is the smallest number :%d%n" , thirdInteger);
		   }

	}
}