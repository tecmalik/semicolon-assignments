import java.util.Scanner;
public class PizzaApp{

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
	
	
	menu();
	pizzaOrder();
	
	
	}
	public static void printLine(){
		System.out.println();	
	}
	public static void printOut(String texts ){
		System.out.print(texts);
	}
	
	public static void menu(){
		printOut("Welcome to Iya Moses joint Ajegunle.");
	printLine();
	printOut(" -------------------------------------------------");
	printLine();
	printOut(" |   pizza Type | number of slice | price per box |");
	printLine();
	printOut(" |  sapa size  | 4	       | 2,500		  |");
	printLine();
	printOut(" |  small money| 6	       | 2,900		  |");
	printLine();
	printOut(" |  big boys   | 8	       | 4,000		  |");
	printLine();
	printOut(" |  Odogwu     | 12	       | 5,200		  |");
	printLine();
	printOut(" -------------------------------------------------");
	printLine();
	}
	
	public static void pizzaOrder(){
	
			printOut("Enter pizza type : ");
	printLine();
	String pizzaType = input.nextLine().toLowerCase();
	if (pizzaType.equalsIgnoreCase("sapa pizza")){

	printOut("Enter the number of Guest you have : ");
	printLine();
	int numberOfGuest = input.nextInt();

	printOut("How many Box of Sappa pizza : ");
	printLine();
	int numberOfSapaPizzaBoxes = input.nextInt();
	
	printOut("Number of boxes of pizza to buy = "+numberOfSapaPizzaBoxes+"boxes");
	printLine();


if (numberOfGuest < numberOfSapaPizzaBoxes*4 ){
	printOut("Sapa size contains 4 slices per box, "+numberOfSapaPizzaBoxes+" boxes should be sufficient for "+ numberOfGuest+" persons as it would contain "+ 4*numberOfSapaPizzaBoxes +" slice in all");
	printLine();
	int result1 = numberOfSapaPizzaBoxes*4 - numberOfGuest;
	printOut("Number of left over sclice after serving = "+ result1);
	printLine();

	}
	else{
		printOut("Sapa size contains 4 slices per box, "+numberOfSapaPizzaBoxes+" boxes should not be sufficient for "+ numberOfGuest+" persons as it would contain "+ 4*numberOfSapaPizzaBoxes  +" slice in all");
	printLine();
	int result2 = numberOfGuest-numberOfSapaPizzaBoxes*4;
	printOut(" slice will be short with "+ result2);
	printLine();
	}
	
	}

else if (pizzaType.equalsIgnoreCase("small money")){

	printOut("Enter the number of Guest you have : ");
	printLine();
	int numberOfGuest = input.nextInt();

	printOut("How many Box of small money pizza : ");
	printLine();
	int numberOfsmallmoneyBoxes = input.nextInt();
	
	printOut("Number of boxes of pizza to buy = "+numberOfsmallmoneyBoxes+"boxes");
	printLine();
	if (numberOfGuest < numberOfsmallmoneyBoxes*6 ){
	printOut("Small money size contains 6 slices per box, "+numberOfsmallmoneyBoxes+" boxes should be sufficient for "+ numberOfGuest+" persons as it would contain "+ 6*numberOfsmallmoneyBoxes +" slice in all");
	printLine();
	int result1 = numberOfsmallmoneyBoxes*6 - numberOfGuest;
	printOut("Number of left over sclice after serving = "+ result1);
	printLine();

	}
	else{
		printOut("Small money size contains 6 slices per box, "+numberOfsmallmoneyBoxes+" boxes should not be sufficient for "+ numberOfGuest+" persons as it would contain "+ 6*numberOfsmallmoneyBoxes  +" slice in all");
	printLine();
	int result2 = numberOfGuest-numberOfsmallmoneyBoxes*6;
	printOut(" slice will be short with "+ result2);
	printLine();
	}
	
	
	
	
	} 

else if (pizzaType.equalsIgnoreCase("big boys")){

	printOut("Enter the number of Guest you have : ");
	printLine();
	int numberOfGuest = input.nextInt();

	printOut("How many Box of big boys pizza : ");
	printLine();
	int numberOfbigboysBoxes = input.nextInt();
	
	printOut(" Number of boxes of pizza to buy = "+numberOfbigboysBoxes+"boxes");
	printLine();
	if (numberOfGuest < numberOfbigboysBoxes*8 ){
	printOut("Bigboy size contains 8 slices per box, "+numberOfbigboysBoxes+" boxes should be sufficient for "+ numberOfGuest+" persons as it would contain "+ 8*numberOfbigboysBoxes +" slice in all");
	printLine();
	int result1 = numberOfbigboysBoxes*8 - numberOfGuest;
	printOut("Number of left over sclice after serving = "+ result1);
	printLine();

	}
	else{
		printOut("Big boy size contains 8 slices per box, "+numberOfbigboysBoxes+" boxes should not be sufficient for "+ numberOfGuest+" persons as it would contain "+ 8*numberOfbigboysBoxes  +" slice in all");
	printLine();
	int result2 = numberOfGuest-numberOfbigboysBoxes*8;
	printOut(" slice will be short with "+ result2);
	printLine();
	}
	
	
	
	
	} 

		
	else if (pizzaType.equalsIgnoreCase("odogw")){

	printOut("Enter the number of Guest you have : ");
	printLine();
	int numberOfGuest = input.nextInt();

	printOut("How many Box of Odogw pizza : ");
	printLine();
	int numberOfOdogwBoxes = input.nextInt();
	
	printOut("Number of boxes of pizza to buy = "+numberOfOdogwBoxes+"boxes");
	printLine();
	if (numberOfGuest < numberOfOdogwBoxes*12 ){
	printOut("Odogwu size contains 12 slices per box, "+numberOfOdogwBoxes+" boxes should be sufficient for "+ numberOfGuest+" persons as it would contain "+ 12*numberOfOdogwBoxes +" slice in all");
	printLine();
	int result1 = numberOfOdogwBoxes*12 - numberOfGuest;
	printOut("Number of left over sclice after serving = "+ result1);
	printLine();

	}
	else{
		printOut("Odoguw size contains 12 slices per box, "+numberOfOdogwBoxes+" boxes should not be sufficient for "+ numberOfGuest+" persons as it would contain "+ 12*numberOfOdogwBoxes  +" slice in all");
	printLine();
	int result2 = numberOfGuest-numberOfOdogwBoxes*12;
	printOut(" slice will be short with "+ result2);
	printLine();
	}
	
	
	
	
	} 

	
	
	}



}