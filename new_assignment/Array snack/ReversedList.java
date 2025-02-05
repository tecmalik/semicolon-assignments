public class ReversedList{
	public int[] reversinglist(int [] numbers){
		int[] reverse = new int [numbers.length];
		for(int count = 0; count<numbers.length; count++ ){
			reverse[count] = numbers[numbers.length - 1 - count];
		}
	
		return reverse;
	
}