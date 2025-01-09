import java.util.Scanner;

public class CardValidator{

    static long cardNumber;

    static Scanner input = new Scanner(System.in);

    public static void main(String... args){

        cardValidatorChecker();
    }

    public static void cardValidatorChecker(){

        System.out.print("Enter Credit-Card number : ");

        try{
        long cardNumber = input.nextLong();
        } catch (Exception e) {
            System.out.println("Invalid input !!!!!");
            input.nextLine();
        }
        if (cardLength(cardNumber) == true){

            long[] cardDigits = firstDigitValue(cardNumber);

            if (cardDigits[0] == 4){
                System.out.println("************************************************* ");
                System.out.print(" Credit card type : Visa Card ");
                System.out.println(" Credit card type : ");
                System.out.printf(" Credit card Number : %d%n",cardNumber);
                System.out.printf(" Credit card length : %d%n",cardDigits.length);
                System.out.print(" Credit card Status : ");
                System.out.print(getValidity(cardDigits));
                System.out.println("************************************************* ");
            }
            else if (cardDigits[0] == 5){
                System.out.println("************************************************* ");
                System.out.print(" Credit card type : Master card");
                System.out.println(" Credit card type : ");
                System.out.printf(" Credit card Number : %d%n",cardNumber);
                System.out.printf(" Credit card length : %d%n",cardDigits.length);
                System.out.print(" Credit card Status : ");
                System.out.println(getValidity(cardDigits));
                System.out.println("************************************************* ");

            }
            else if (cardDigits[0] == 3 && cardDigits[1]== 7 ){
                System.out.println("************************************************* ");
                System.out.print(" Credit card type : American Express Card");
                System.out.println(" Credit card type : ");
                System.out.printf(" Credit card Number : %d%n",cardNumber);
                System.out.printf(" Credit card length : %d%n",cardDigits.length);
                System.out.print(" Credit card Status : ");
                System.out.println(getValidity(cardDigits));
                System.out.println("************************************************* ");
            }
            else if (cardDigits[0] == 6){
                System.out.println("************************************************* ");
                System.out.print(" Credit card type : Discover Card");
                System.out.println(" Credit card type : ");
                System.out.printf(" Credit card Number : %d%n",cardNumber);
                System.out.printf(" Credit card length : %d%n",cardDigits.length);
                System.out.print(" Credit card Status : ");
                System.out.println(getValidity(cardDigits));
                System.out.println("************************************************* ");
            }
            else{
                System.out.print("Card is Not Valid");
            }


        }
        else{System.out.print("Card is Not Valid !!!");
        }


    }

    public static String getValidity(long[] value){
        boolean validity = divisibilityBy10Checker(getSumOfReversedEvenAndOddPositions(value));
        if (validity == true){
            return "Valid";
        }

        return "Invalid";
    }

    public static long getSumOfReversedEvenAndOddPositions(long[] numbers){
        long sum = 0;
        sum = getSummedSquareOfReversedEvenPosition(numbers) + getSumOfReversedOddPosition(numbers) ;
        return sum;
    }


    public static boolean cardLength(long cardNumber){
        int numberlength = String.valueOf(cardNumber).length();

        if (numberlength<13 || numberlength>16){
            return false;
        }

        return true;
    }


    public static long[] firstDigitValue(long numbers){
        int size =String.valueOf(numbers).length();
        long[] firstDigit = new long[size];
        int count = size;
        while(numbers > 0){

            firstDigit[count-1] = numbers % 10;
            numbers = numbers/10;
            count--;
        }
        return firstDigit;
    }

    public static long getSummedSquareOfReversedEvenPosition(long[] numbers){
        long totalOfEvenSquares = 0;
        for(int count = numbers.length-2; count >= 0 ; count-=2){

            if( (((numbers[count]) * 2) < 10)){
                totalOfEvenSquares += ((numbers[count]) * 2);

            }else{

                totalOfEvenSquares +=(((numbers[count]) * 2)/10 )+ (((numbers[count]) * 2)%10);


            }

        }


        return totalOfEvenSquares;
    }

    public static long getSumOfReversedOddPosition(long[] numbers){
        long totalOfOddPosition = 0;
        for(int count = numbers.length-1 ; count > 0 ; count-=2){

            totalOfOddPosition += numbers[count];
        }


        return totalOfOddPosition;
    }


    public static boolean divisibilityBy10Checker(long number){
        if (number%10 == 0){
            return true;
        }

        return false;
    }


}