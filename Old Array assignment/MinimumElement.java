import java.util.Scanner;
public class MinimumElement{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int[] numberslist = new int[5];
	int minimumElement = 0;
	
	for(int element = 0;  element<numberslist.length ; element++){
		System.out.print("Enter a number : ");
		 numberslist[element] = input.nextInt();
		if (element< 1){
			minimumElement = numberslist[0];
		}
		
		if (numberslist[element] < minimumElement){
			minimumElement = numberslist[element];
		}		
	}
	System.out.print("The Minimum Element is "+ minimumElement);


	}



	}
