import java.util.Scanner;
public class MyersBquestionnaire{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String[][] myersBquestionnaire = {
	{"A. expend energy, enjoy group", \t\t"B. conserve energy, enjoy one on one\n"};
	{"A. Interpret literally", \t\t"B. look for meaning and possibilities\n"};
	{"A. Logical, thinking, questioning", \t\t"B. Empathetic, feeling, accommodating\n"};
	{"A. organized, orderly", \t\t"B. Flexible, adaptable\n"};
	{"A. more outgoing, think out loud \t\tB. more reserved, think to yourself\n"};
	{"A. Practical, realistic, experiential", \t\t"B. Imaginative, innovative, theoretical\n"};
	{"A. Candid, straight forward, frank", \t\t"B. Tactful, kind, encouraging\n"};
	{"A. Plan, schedule", \t\t"B. unplanned, Spontaneous\n"};
	{"A. Seek many tasks, public activities, interaction with others", \t\t"B. seek private, solitary activities with quiet to concentrate\n"};
	{"A. Standard, usual, conventional", \t\t"B. Different, novel, unique\n"};
	{"firm, tend to criticize, hold the line", \t\t"B. gentle, tend to appreciate, conciliate\n"};
	{"regulated, structured", \t\t"B. Easy-going, live and let live\n"};
	{"A. External, communicative, express yourself", \t\t"B. Internal, reticent, keep to yourself\n"};
	{"A. Focus on here-and-now", \t\t"B. Look to the future, global perspective, big picture\n"};
	{"A. tough-minded, just", \t\t"B. tender-hearted, merciful\n"};
	{"A. preparation, plan ahead", \t\t"B. go with the flow, adapt as you go\n"};
	{"A. Active, initiate", \t\t"B. reflective, deliberate\n"};
	{"A. facts, things, what is", \t\t"B. ideas, dreams , what could be, philosophical\n"};
	{"A. matter of fact, issue-oriented", \t\t"B. sensitive, people-oriented, compassionate\n"};
	{"A. control, govern", \t\t"B. latitude, freedom\n"};

	}

	char[] answers = new char[20];
	System.out.print("What is your name?");
	char response = input.next().charAt(0);

	for(int question = 0; question <= questions.length; question++){
		System.out.print(questions[question][0]);
		System.out.print(questions[question][1]);

		System.out.print("Select option A or B");
		char options = input.next().charAt(0);

		

	}
}

