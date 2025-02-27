import java.util.ArrayList;

public class MissingNumbers {
    public static void main(String[] args) {

        int[] numbers = {2,3,4,5,6};
        MissingNumbers.getMissingNumbers(numbers);


    }
    public static ArrayList<Integer> getMissingNumbers(int[] numbers){
        int lowestNumber = numbers[1];
        ArrayList<Integer> missingNumbers = new ArrayList<Integer>();
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] < lowestNumber ) lowestNumber = numbers[index];
        }
        int highestNumber = numbers[1];
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > highestNumber  ) highestNumber = numbers[index];
        }
        ArrayList<Integer> enteredNumbers = new ArrayList<Integer>();
        for (int index = 0; index < numbers.length; index++) {
            enteredNumbers.add(numbers[index]);
        }

        for (int index = lowestNumber ; index < highestNumber; index++) {
            if (enteredNumbers.contains(index)==false) {
                missingNumbers.add(index);
            }
        }
        return missingNumbers ;
    }






}