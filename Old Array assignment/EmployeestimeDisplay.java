import java.util.Arrays;
public class EmployeestimeDisplay{
	public static void main(String... args){
		
	
		String[] employees = {"Employee0" , "Employee1" , "Employee2" , "Employee3" , "Employee4", "Employee5" , "Employee6" , "Employee7"};
		int[][] workHours = {
		
		{2, 4, 3, 4, 5, 8, 8},
		{7, 3, 4, 3, 3, 4, 4},
		{3, 3, 4, 3, 3, 2, 2},
		{9, 3, 4, 7, 3, 4, 1},
		{3, 5, 4, 3, 6, 3, 8},
		{3, 4, 4, 6, 3, 4, 4},
		{3, 7, 4, 8, 3, 8, 4},
		{6, 3, 5, 9, 2, 7, 9}

		};
		
		int[] totalHours = new int[8];
		
		for(int indexinWorkHours = 0 ; indexinWorkHours<totalHours.length ; indexinWorkHours++){
			
			for(int arrayindexInWorkHour = 0 ; arrayindexInWorkHour< workHours[indexinWorkHours].length; arrayindexInWorkHour++){
				totalHours[indexinWorkHours] += workHours[indexinWorkHours][arrayindexInWorkHour];
			}
			
		}
	System.out.print(Arrays.toString(totalHours));
		
	

	}
}