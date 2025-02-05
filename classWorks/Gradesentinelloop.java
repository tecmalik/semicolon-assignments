import java.util.Scanner;
public class Gradesentinelloop{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int grade = 0;
		while(grade != -1){
			System.out.println("Enter student grade :");
			grade = input.nextInt();
				
			if (grade < 50){
				System.out.println("D");
			}
			else if (grade >= 50 && grade <= 60){
				System.out.println("C");
			}
			else if (grade > 60 && grade <= 80){
			System.out.println("D");
			}
			else if (grade >= 80 && grade <= 100){
			System.out.println("A");
			}

		}
			 
		
	}
}