public class RunningTotal{
	public static int[] listRunningtotal(int[] numbers){
		int[] runningTotal = int[numbers.length];
		for(int count; count<numbers.length; count++){
			runningTotal[count] += numbers[count]
		}
		return runningTotal;
	}
}
