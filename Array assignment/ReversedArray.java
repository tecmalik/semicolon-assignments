public class ReversedArray{
	public static void main(String[] agrs){
		int [] integers = {34,54,65,3,33,12,15,23};
		int [] reverse = new int[integers.length];

		System.out.println("initial number"); 
		for(int display = 0; display < integers.length; display++){
		
		System.out.print(integers[display]+" ");
		}

		System.out.println("the reverse of the number is :");
		for(int index = 0; index<integers.length; index++){
		
		 reverse[index] = integers[integers.length-1-index] ;
		}
		
		for(int display = 0; display < integers.length; display++){
		
		System.out.print(reverse[display]+" ");

		
		}
		
	
	}
}