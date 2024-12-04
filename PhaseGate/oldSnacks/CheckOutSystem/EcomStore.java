import java.util.ArrayList;
import java.util.Scanner;
public class EcomStore{

	static Scanner input = new Scanner(System.in); 
	
	
	public static void main(String... args){


	ArrayList<String> itemsPurchased = new ArrayList<String>();
	ArrayList<Double> itemsPrices = new ArrayList<Double>();
	ArrayList<Integer> itemsNumber = new ArrayList<Integer>();
	
	

	
	printOut("What is the customer's Name");
	printNextLine();
	String customersName = input.nextLine();
	
	addToCart( itemsPurchased, itemsPrices, itemsNumber);
	checkOut(itemsPurchased, itemsPrices, itemsNumber);
	
		
	
	
	
	
	
	}
	public static void checkOut(ArrayList<String> itemsPurchased, ArrayList<Double> itemsPrices, ArrayList<Integer> itemsNumber){
		
		printOut("Add more Items ?\n (yes or no)");
	printNextLine();
	String moreItemsOption = input.next().toLowerCase();
	
	if(moreItemsOption.equalsIgnoreCase("no")){
	
		printOut("What is Your Name ?");
		printNextLine();
		String cashiersName1 = input.nextLine();
		String cashiersName = input.nextLine();
		
		printOut("how much discount will he/she get ?");
		printNextLine();
		int discount = input.nextInt();
		
		printOut("SEMICOLON STORES");
		printNextLine();
		printOut("MAIN BRANTCH");
		printNextLine();
		printOut("LOCATION : 312, HERBERT WAY,SABO YABA, LAGOS STORES?");
		printNextLine();
		printOut("TEL : 03293828343");
		printNextLine();
		printOut("date and time");
		printNextLine();
		printOut(cashiersName);
		printNextLine();
		printOut("-------------------------------------------------------------------------------------------------------------------------------------------------");
		printNextLine();

		System.out.printf("%11s%12s%14s%20s\n", "ITEMS" , "QTY","PRICE","TOTAL(NGN)");
		printNextLine();

		





		}
	 else if(moreItemsOption.equalsIgnoreCase("yes")){   
 		addToCart( itemsPurchased, itemsPrices, itemsNumber);
		checkOut(itemsPurchased, itemsPrices, itemsNumber);

		}
		
		else{
			printOut("invalid input !!! \nEnter yes or no");
		}
	
	
	
	
	
	
	
	}



	public static void addToCart(ArrayList<String> itemsPurchased, ArrayList<Double> itemsPrices, ArrayList<Integer> itemsNumber){
		printOut("What did the user buy ?");
		printNextLine();
		String purchased = input.next();
		itemsPurchased.add(purchased);
	
		printOut("How many pieces ?");
		printNextLine();
		int numberOfItempurchased = input.nextInt();
		itemsNumber.add(numberOfItempurchased);

		printOut("How much per unit ?");
		printNextLine();
		double amountPerUnit = input.nextDouble();
		itemsPrices.add(amountPerUnit);
	
		
	
	}

	
	public static void printOut(String texts ){
		System.out.print(texts);
	}

	public static void printNextLine(){
		System.out.println();
	}
	public static void sum( ArrayList<String> itemsPurchased, ArrayList<Double> itemsPrices,ArrayList<Integer> itemsNumber ){
		/**for(int count=0; count<itemsPurchased.size(); count++){
			System.out.printf("%11d%12d%14.4f%20.4f",  itemsPurchased(count), itemsNumber(count), itemsPrices(count) , itemsNumber(count)*itemsPrices(count) );
		
		}*/	
	}
	
	
	


}