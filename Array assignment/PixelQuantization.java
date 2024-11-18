public class PixelQuantization{
	public static void main (String[] args){
		int [] quantizationvalues = {10,30,50,70,90,110,130,150,170,190};
		System.out.println(" Quantization values ");
		
		for(int counter = 0 ; counter<quantizationvalues.length; counter++){
		if (counter == 9){
		System.out.printf("%5d :", 190 );
		}
		else{
		System.out.printf("%02d-%02d :", counter*20+1 , counter*20);
		
		}

		System.out.print(quantizationvalues[counter]);
		System.out.println();
		}
	}
	
}