import java.util.Scanner;
public class MaximumElement{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int[] numberslist = new int[5];
	int maximumElement = 0;
	
	for(int element = 0;  element<numberslist.length ; element++){
		System.out.print("Enter a number : ");
		 numberslist[element] = input.nextInt();
		if (element< 1){
			maximumElement = numberslist[0];
		}
		
		if (numberslist[element] > maximumElement){
			maximumElement = numberslist[element];
		}		
	}
	System.out.print("The Maximum Element is "+ maximumElement);


	}



	}
