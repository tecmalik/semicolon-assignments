import java.util.Scanner;
public class NigeriaGeoPoliticalZones {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a State: ");
        String userInput = scanner.next();

        for( Zones zone: Zones.values() ) {
           // System.out.println(zone);
            for(String state : zone.getState()){
             //   System.out.println(state);
                if(state.equals(userInput)) {
                    System.out.println(userInput + " is within the " + zone + " zone");
                }
            }
        }
    }
}