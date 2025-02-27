import java.util.ArrayList;

public class IceBreaker {


    public static void main(String[] args) {

    }

    public static ArrayList<Integer> multiplesOfNumber(int firstRange, int secondRange,int number) {

        ArrayList<Integer> multiples = new ArrayList<>();
        if (firstRange < secondRange) {
            for (int index = firstRange; index <= secondRange; index++) {
                if(index % number == 0)multiples.add(index);
            }
        }
        else {
            for (int index = secondRange; index <= firstRange; index++) {
                if (index % number == 0) multiples.add(index);
            }

        }
        return multiples;
    }
}