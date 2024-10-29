public class PatternsAgain{

	public static void main(String [] args){

		for(int rowHandler = 1; rowHandler <= 6; rowHandler++){
			System.out.println();

			for(int patternHandler = 1; patternHandler <= rowHandler; patternHandler++)
				System.out.print("*"); 
		}
System.out.println();
System.out.println("*"); 
System.out.println("**"); 
System.out.println("***"); 
System.out.println("****"); 
System.out.println("*****"); 
System.out.println("******");

System.out.println();

		for(int rowHandler = 1; rowHandler <= 6; rowHandler++){
			System.out.println();

			for(int patternHandler = 6; patternHandler >= rowHandler; patternHandler--)
				System.out.print("*"); 
		}

			System.out.println();			

	int count = 0;		
		for(int rowHandler = 1; rowHandler <= 100; rowHandler++){


				if (rowHandler % 2 == 0) count++;

				
		}

System.out.print(count  ); 
System.out.println();
		

		int number = 100;
		int numberCounter = 0;

		while(number <= 1000){
		
			if (number % 3 == 0 || number % 4 == 0)	{
				System.out.print(number + " "); 
					numberCounter++;
			}

				if (numberCounter % 10 == 0) System.out.println();
			number++;
		}



		for(int rowHandler = 1; rowHandler <= 6; rowHandler++){
			System.out.println();

			for(int spaceController = 1; spaceController <= 6 - rowHandler; spaceController++)
				System.out.print(" "); 

			

			for(int patternHandler = 1; patternHandler <= rowHandler; patternHandler++)
				System.out.print("*"); 
		}
	}

}


