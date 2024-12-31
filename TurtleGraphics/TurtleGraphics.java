public class TurtleGraphics{
	public static void main(String){
		int[][] floor = new int[20][20];
	
		while ( != 9){
			
			command();
		}
		
	
	}


	public static void command(){
		System.out.print("1. Pen up.\n2. Pen down.\n3. Turn right.\n4. Turn left \n5,10. Moving foward 10 spaces(replace 20 doe diffrent number of spaces).\n6. DIsplay the 20-by-20 array.\n9End of data(sentinel) ");
	}




			
}