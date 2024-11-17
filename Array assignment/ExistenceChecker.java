import java.util.Scanner;
public class ExistenceChecker{
 public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int [] hiddenElements = {10,20,30,40};
	int counter = 1;
	System.out.print("Enter the element to be checked if it exit in the list: ");
	int element = input.nextInt();
	for(int index = 0 ; index < hiddenElements.length ; index++){ 

		if(hiddenElements[index] == element){
			System.out.print("True");
			break;
		}
	
	}
	
	for(int index = 0 ; index < hiddenElements.length ; index++){ 

		if(hiddenElements[index] != element){
			counter++;
		}
	
	}

	if(counter  != hiddenElements.length){
		System.out.print("False");

		}


	}
}