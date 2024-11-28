import java.util.Arrays;
import java.util.Scanner;
public class EvenFunction{
public static void main(String... args){


System.out.println(prime(7));
System.out.println(primenumberslist(19));

System.out.print(Arrays.toString (primenumberslist(19)));



}
	

public static int[] primenumberslist(int number){
	int counter = 0;
	for(int count = 0; count<number; count++){
		if (prime(count) != 0){
			counter++;
		}
	}	
	int[] primeNumbers = new int[counter];
	int index = 0;
	
	for(int count = 0 ; count<number; count++){
		if(prime(count) != 0){
			primeNumbers[index] = prime(count);
			index++;
		}
	}
	return 	primeNumbers;
}

public static int prime(int digit){
	int count = 0;
	for(int each = 1; each< digit ; each++){
		if(digit%each == 0){
		count++;
		}
		
	}
if(count<2){
return digit;
}
return 0;
		
}	


} 