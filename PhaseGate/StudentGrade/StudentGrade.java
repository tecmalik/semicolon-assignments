import java.util.Scanner;
public class StudentGrade{

	static Scanner input = new Scanner(System.in);



	
	public static void main(String... args){

		 collectStudentsInputs();

		
	}
	public static void collectStudentsInputs(){

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
		
	for(int count = 0 ; count < studentNumber ; count++){

		System.out.println(getSort(eachStudentTotal(studentGrade, studentNumber))[count]+" ******");

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
		System.out.printf("%10d	",eachStudentTotal(studentGrade, studentNumber)[count]);
		System.out.printf("%11.2f",((float)(eachStudentTotal(studentGrade, studentNumber)[count])/numberOfSubjects));
		System.out.printf("%14d",position(getSort(eachStudentTotal(studentGrade, studentNumber)) ,eachStudentTotal(studentGrade, studentNumber) )[count]+1);
		
		System.out.println();		
		}
		
		
		System.out.println("========================================================================== \n\n========================================================================== ");
		System.out.println();


	
		System.out.println("STUDENT SUMMARY");
		System.out.println("--------------------------------------------------------------------------------");
		for(int index = 0; index < numberOfSubjects ; index++){
			
	
				System.out.println( studentSubjects[index] );
				System.out.print("Highest Scoring Student is ");
				for(int count=0; count < numberOfSubjects ; count++){
					if(highestAndLowestPreSubject[count][0] == studentGrade[count][index]){
						//System.out.printf("%s Scoring :%d%n",studentNames[count],highestAndLowestPreSubject[count][0]);
					}
				} 
				System.out.print("lowest Scoring Student is ");
				for(int count=0; count < numberOfSubjects ; count++){

					if(highestAndLowestPreSubject[count][1] == studentGrade[count][index]){
						System.out.printf("%s Scoring :%d%n",studentNames[count] ,highestAndLowestPreSubject[count][1]);
					}
				}
				//System.out.printf(" Total Score is : %d",totalPreSubject[index]);
				System.out.println();
				//System.out.printf(" Average Score Score is : %.3f%n",(float)totalPreSubject[index]/studentNumber);
				//System.out.printf(" Number of Passes: %d \n Number of failures is : %d%n",passesAndFailuresOfEachSubjects[index][0] ,passesAndFailuresOfEachSubjects[index][1] ); 
				System.out.println("--------------------------------------------------------------------------------");
			

		} 
	
	
	
	
	
	
		

		
	}


	public static int listTotal( int[] scoresList ){
		int total = 0;
		for(int scores = 0; scores<scoresList.length; scores++){
			total+=scoresList[scores]; 
		}
		return total;
	}
	
	public static int[] eachStudentTotal(int[][] studentGrade, int studentNumber){
		int[] studentTotal = new int[studentNumber];	
		for(int count = 0; count<studentTotal.length ; count++ ){
		
			studentTotal[count] = listTotal(studentGrade[count]); 
			
		}
		return studentTotal;
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

	public static int[] position(int[] sortedTotal , int[] studentTotal ){
		
		int[] position = new int[sortedTotal.length];

		for(int count = 0; count<sortedTotal.length ;count++){
				 
			for(int index = 0; index < sortedTotal.length; index++){
				
				if (sortedTotal[count] == studentTotal[index]){
					
					position[index] = count ;
					
				}
			}
		}
		return position;
	}
	
	

	public static int[][] eachSubjects(int numberOfSubjects, int studentNumber ,int[][] studentGrade){
		int[][] eachSubjects = new int[numberOfSubjects][studentNumber];
		for(int index = 0 ; index<numberOfSubjects ; index++){
			for(int count = 0 ; count<studentNumber ; count++){
				eachSubjects[index][count] = studentGrade[count][index];
			}		
		}
		return eachSubjects;
	}

	public static int[][] highestAndLowestPreSubject(int numberOfSubjects, int[][] eachSubjects){
		int[][] highestAndLowestPreSubject = new int [numberOfSubjects][2]; 
		for(int index=0; index<numberOfSubjects ; index++){
		
		highestAndLowestPreSubject[index][0] = highestInteger(eachSubjects[index]);
		highestAndLowestPreSubject[index][1] = lowestInteger(eachSubjects[index]);
		
		}
		return highestAndLowestPreSubject;
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





	

}