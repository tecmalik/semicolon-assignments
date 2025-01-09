
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String[] operators = {"+","-","*"};

    static int[] answers = new int[5];
    static int[] firstnumbers = new int[5];
    static int[] secondnumbers = new int[5];
    static String[] generatedOprators = new String[5];
    static int[] inputedAnswers = new int[5];

    public static void main(String[] args) {

        for(int count = 0; count < 5; count++) {
            int operatorIndex = random.nextInt(3);;
            int firstRandomNumber = random.nextInt(21) + 1;
            int secondRandomNumber = random.nextInt(21) + 1;

            System.out.printf(" Hi there please Calculate : %d %s %d = ?\n", firstRandomNumber, operators[operatorIndex], secondRandomNumber);
            answers[count] = getAnswer(operators[operatorIndex], firstRandomNumber, secondRandomNumber);
            firstnumbers[count] = firstRandomNumber;
            generatedOprators[count] = operators[operatorIndex];
            secondnumbers[count] = secondRandomNumber;

            int answer = 0;
                System.out.println("Enter answer: ");
            try {
                answer = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }

            inputedAnswers[count] = answer;
        }
        int passcounter = 0;
        int failcounter = 0;
        System.out.println("Answers"  );
          for(int count = 0; count < firstnumbers.length; count++){
              System.out.printf("for %d %s %d = ? \n Your answer was %d correct answer was %d",firstnumbers[count],generatedOprators[count],secondnumbers[count],inputedAnswers[count],answers[count] );
                if(inputedAnswers[count] == answers[count]){
                    System.out.println("Correct");
                    passcounter++;
                }
                else if(inputedAnswers[count] != answers[count]){
                    System.out.println("inCorrect");
                    failcounter++;
                }
          }
        System.out.printf("you passed %d",passcounter);
        System.out.println("you failed "+failcounter);

    }
    public static int getAnswer(String operator, int firstRandomNumber ,int secondRandomNumber){
        int answer = 0;
        if(operator.equals("+")){
            answer =  firstRandomNumber + secondRandomNumber;
        }
        else if (operator.equals("-")){
            answer =  firstRandomNumber - secondRandomNumber;
        }
        else if (operator.equals("*")){
            answer =  firstRandomNumber * secondRandomNumber;
        }
        return answer;
    }


}