package classwork2;

public class SwitchedNumbers {

    public static void main(String[] args) {
        System.out.print(switchedNumbers( 55, 77));

    }

    public static String switchedNumbers(int numberOne, int numberTwo){
        numberOne = numberOne + numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne = numberTwo - numberOne ;

        return String.format( -numberOne +" "+ numberTwo);
    }


}
