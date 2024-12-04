import java.util.Scanner;
public class StudentGrade{
	
	public static void main(String... args){

		Scanner input = new Scanner(System.in);
	 
		System.out.println("Enter number of Students : ");
		int studentNumber = input.nextInt();
		System.out.println("Enter number of Subjects : ");
		int numberOfSubjects = input.nextInt();
		
		
		String[] studentNames = new String[studentNumber];
		String[] sortstudentNames = new String[studentNumber];
		String[] studentSubjects = new String[numberOfSubjects];
		int[][] studentGrade = new int[studentNumber][numberOfSubjects]; 
		int[][] passesAndfaliures = new int[studentNumber][2];
		
		input.nextLine();
		for(int count = 0; count<studentNames.length ; count++){
			
			System.out.println("Enter names of Students : ");
			studentNames[count] = input.nextLine();
		}	
		
		for(int count = 0; count<studentSubjects.length ; count++){
		
			System.out.println("Enter names of subject Students : ");
			studentSubjects[count] = input.nextLine();
		}	
	
	
	
		for(int count = 0; count<studentNumber ; count++){
				
			System.out.println("Enter grade "+ studentNames[count] );
			int failures = 0;
			int passes = 0;
			for(int counter = 0; counter<numberOfSubjects ; counter++){
				
				
				System.out.printf("Enter %s  grade :",studentSubjects[counter]);
				
					studentGrade[count][counter]  = input.nextInt();
					if (studentGrade[count][counter]<0 || studentGrade[count][counter]>100){
						System.out.print(" invalid !!! \nEnter a valid grade !!!");
						--counter;
					}
					if (studentGrade[count][counter] > 45){
						passes +=1;
						passesAndfaliures[count][0] = passes;
					}
					if ( studentGrade[count][counter] < 45  ){
						failures+=1;
						passesAndfaliures[count][1] = failures ;
					}
			
				
				System.out.println("Saving>>>>>>>>>>>>>>>>>>>>");
			}
			
			
		}
			int[] studentTotal = new int[studentNumber];
			int[] sortedStudentTotal = new int[studentNumber];
		for(int count = 0; count<studentTotal.length ; count++ ){
		
			studentTotal[count] = listTotal(studentGrade[count]); 
			sortedStudentTotal[count]= studentTotal[count];
		}
		
		
		float[] studentAverage = new float[studentNumber];
		for(int count = 0; count<studentAverage.length ; count++ ){
	
			studentAverage[count] = studentTotal[count]/(float)numberOfSubjects; 
	
		}
  
		
		
		sort(sortedStudentTotal);
	
			
		int[] posiition = new int[studentNumber];
		for(int count = 0; count<sortedStudentTotal.length ;count++){
			sort(sortedStudentTotal)[count];
			for(int index = 0; index < sortedStudentTotal.length; index++){
				if ( sort(sortedStudentTotal)[count] == studentTotal[count] ){
					count = posiition[count];
				}
			}
		}





				
	System.out.println("========================================================================== ");
	System.out.print("Student");
		for(int count=0 ; count<studentNumber; count++){
		System.out.print("	"+studentSubjects[count]);
		
		}
	System.out.print("      ToT");
	System.out.print("      AVE");
	System.out.println("    	  pos");
	System.out.println("========================================================================== ");


		for(int count=0 ; count< studentNumber ; count++){
			int position = 1;
			System.out.print(studentNames[count]);
			for(int index = 0 ; index < studentSubjects.length ; index++){
			
				System.out.printf("	" + studentGrade[count][index] ); 
								
			} 
			System.out.print("	"+studentTotal[count]);
			System.out.printf("	 %.2f",studentAverage[count]);
			System.out.print("	"+sortstudentNames[count]+" "+ studentTotal[count]+" is "+ position +" position ");
			++position;
		System.out.println();		
		}
		System.out.println("========================================================================== ");
		
		for(int count=0 ; count< studentNumber ; count++){
		
			System.out.printf(studentNames[count]+"	passed : " + passesAndfaliures[count][0] +" failed:"+passesAndfaliures[count][1]);
			
			System.out.println();
			System.out.print(studentTotal[count]);		
		}
		


	}
	
	

	
	public static int listTotal( int[] scoresList ){
		int total = 0;
		for(int scores = 0; scores<scoresList.length; scores++){
			total+=scoresList[scores]; 
		}
		return total;
	}
	
	
	public static int[] sort(int[] sortedStudentTotal){
		for(int count = 0; count < sortedStudentTotal.length ; count++){ 
		
			for(int counter = 1; counter < sortedStudentTotal.length-1-count; counter++){

				if (sortedStudentTotal[counter] > sortedStudentTotal[counter+1]){
				int container = sortedStudentTotal[counter+1]; 
				sortedStudentTotal[counter+1] = sortedStudentTotal[counter];
				sortedStudentTotal[counter] = container;
					
				
				}
			
			}
	
	
		}
		return sortedStudentTotal;
	}


	
}