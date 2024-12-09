
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
					if (studentGrade[count][counter] >= 45){
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
			
		for(int count = 0; count<studentTotal.length ; count++ ){
		
			studentTotal[count] = listTotal(studentGrade[count]); 
			
		}
		
		
		float[] studentAverage = new float[studentNumber];
		for(int count = 0; count<studentAverage.length ; count++ ){
	
		studentAverage[count] = studentTotal[count]/(float)numberOfSubjects; 
	
		}
  
		int[] sortedStudentTotal = new int[studentNumber];
		sortedStudentTotal = getSort(studentTotal);

		int[] position = new int[studentTotal.length];

		for(int count = 0; count<sortedStudentTotal.length ;count++){
				 
			for(int index = 0; index < sortedStudentTotal.length; index++){
				
				if (sortedStudentTotal[count] == studentTotal[sortedStudentTotal.length-1-index]){
					
				position[index] = count ;
					
				}
			}
		}


		

				
	System.out.println("========================================================================== ");
	System.out.print("Student");
		for(int count=0 ; count<studentSubjects.length; count++){
			System.out.printf("	%s",studentSubjects[count]);
		
		}
	System.out.printf("%9s ","ToT");
	System.out.printf("%11s","AVE");
	System.out.printf("%14s ","pos");
	System.out.println();
	System.out.println("========================================================================== ");


		for(int count=0 ; count< studentNumber ; count++){
		
		System.out.print(studentNames[count]);
			for(int index = 0 ; index < studentSubjects.length ; index++){
				System.out.printf("	" + studentGrade[count][index] ); 
			} 
		System.out.printf("%10d	",studentTotal[studentNumber-1-count]);
		System.out.printf("%11.2f",studentAverage[count]);
		System.out.printf("%14d",position[count]+1);
		
		System.out.println();		
		}
		
		
		System.out.println("========================================================================== \n\n========================================================================== ");






		int[][] eachSubjects = new int[numberOfSubjects][studentNumber];
		for(int index = 0 ; index<numberOfSubjects.length ; index++){
			for(int count = 0 ; count<studentNumber.length ; count++){
				eachSubjects[index][count] = studentGrade[count][index];
			}		
		}

		int[][] highestAndLowestPreSubject = new int [numberOfSubjects.length][2] 
		for(int index=0; index<numberOfSubjects.length ; index++){
		
		highestAndLowestPreSubject[index][1] = highestInteger(eachSubjects[index]);
		highestAndLowestPreSubject[index][2] = lowestInteger(eachSubjects[index]);
		
		}




		


		System.out.println("STUDENT SUMMARY");
		for(int index = 0; index<numberOfSubjects.length; index++){
			
	
				System.out.println( studentSubjects[index] );
				System.out.print("Highest Scoring Student is");
				for(int count=0; count < studentTotal.length ; count++){

					if(highestAndLowestPreSubject[count][1] == studentGrade[index][count]){
						System.out.printf( %s Scoring %d :",studentNames[count] ,highestAndLowestPreSubject[count][1]);
						System.out.println();
					}
				}
				System.out.println("lowest Scoring Student is");
				for(int count=0; count < studentTotal.length ; count++){

					if(highestAndLowestPreSubject[count][2] == studentGrade[index][count]){
						System.out.printf( %s Scoring %d :",studentNames[count] ,highestAndLowestPreSubject[count][2]);
						System.out.println();
					}
				}

				System.out.println(" AverageScore Score is : %d :",);
				System.out.println(" Number of Passes: %d \n Number of failures %d :" ,  ); 
				break;
		
				if(sortedStudentTotal[sortedStudentTotal.length-1] == ){
			System.out.println("Hihest Scoring Student is ");					break;

			} 
			}
			
		
		}

















		
		for(int count=0 ; count< studentNumber ; count++){
		
			System.out.printf(studentNames[count]+"	passed : " + passesAndfaliures[count][0] +" failed:"+passesAndfaliures[count][1]);
			
			System.out.println();
			System.out.print(sortedStudentTotal[count]);		
		}
		
		System.out.println("");
		
			for(int count=0; count< studentTotal.length; count++){
				int highest = highestInteger(studentTotal);
				
				if( highest == studentTotal[count]){
					
			System.out.printf("the highest student is %s \n with average of %.4f", studentNames[count],(float)highestInteger(studentTotal)/numberOfSubjects);
					
				}
			
			}
			System.out.println();
		
				for(int count=0; count< studentTotal.length; count++){
				int lowest = lowestInteger(studentTotal);
				
				if( lowest == studentTotal[count]){
					
			System.out.printf("the lowest student is %s \n with average of %.4f", studentNames[count],(float)lowestInteger(studentTotal)/numberOfSubjects);
					
				}
			
			}
			System.out.println();



	}	


	
	
	

	
	public static int listTotal( int[] scoresList ){
		int total = 0;
		for(int scores = 0; scores<scoresList.length; scores++){
			total+=scoresList[scores]; 
		}
		return total;
	}
	
	
	public static int[] getSort(int[] sortedStudentTotal){
		for(int count = 0; count < sortedStudentTotal.length-1 ; count++){ 
		
			for(int counter = 0; counter < sortedStudentTotal.length-1-count; counter++){

				if (sortedStudentTotal[counter] < sortedStudentTotal[counter + 1]){
				int container = sortedStudentTotal[counter + 1]; 
				sortedStudentTotal[counter + 1] = sortedStudentTotal[counter];
				sortedStudentTotal[counter] = container;
					
				
				}
			
			
			}
	
	
		} 
		return sortedStudentTotal;
	}
	
	public static int highestInteger(int[] numbers){
		int largest = numbers[0];
		for(int count = 0; count<numbers.length;count++){
			if(numbers[count]>largest){
				largest = numbers[count];
			}
		} 
	return largest; 
	
	}

	public static int lowestInteger(int[] numbers){
		int lowest = numbers[0];
		for(int count = 0; count<numbers.length;count++){
			if(numbers[count]<lowest){
				lowest = numbers[count];
			}
		} 
	return lowest;
	
	}

	
	
}