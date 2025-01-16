import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ComfortInnApp {

    Admin[] adminlist = new Admin[2];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



    }


    public static void adminmenu(){
        System.out.println("WELCOME MADAM GLORIA");
        System.out.println("1. View All Rooms");
        System.out.println("2. Manage Reservations");
        System.out.println("3. Generate Reports");
        System.out.println("4. mark Rooms for Maintenance");
        System.out.println("5. Add Rooms");
        System.out.println("6. View Rooms");
        System.out.println("EXIT");

    }
    public static void usermenu(){
        System.out.println("Welcome, Our Esteemed Custormer!");
        System.out.println("Options :");
        System.out.println("1. Book Room");
        System.out.println("2. View Booking");
        System.out.println("3. Edit Profile");
        System.out.println("4. Check room Availability");
        System.out.println("5. Payment Status");
        System.out.println("6. cancel Booking");
        System.out.println("7. View All Available Rooms");
        System.out.println("8. View Notification");
    }
    public static void userOption(){
        System.out.println("WELCOME TO COMFORT-INN DOCS");

        System.out.println("Select an option:\n1. Admin\n2. Guest\n3. Exit ");
        int option = scanner.nextInt();
        switch (option){
            case 1: System.out.println("Welcome, Madam Gloria!");

                adminmenu();

                break;
            case 2:
                System.out.println("WELCOME TO COMFORT-INN");
                usermenu();
                guestLoginOption();
                break;
            case 3:System.exit(0);
            default:System.out.println("Invalid option");
                userOption();
        }
    }

    public static void guestLoginOption(){
        System.out.println("WELCOME TO COMFORT-INN DOCS");
        System.out.println("Select an option:\n1. Login \n2. create Account.");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("");
                break;
                case 2: System.out.println("");
                break;
                default:System.out.println("Invalid option");

        }
    }
    public static void collectGuestDetails(){
        System.out.println("Enter your first name :");
        String userName = scanner.next();
        System.out.println("Enter your last name :");
        String lastName = scanner.next();
        System.out.println("Enter your phone number :");
        String phoneNumber = scanner.next();
        System.out.println("Enter your email address :");
        String UserEmail = scanner.nextLine();
        System.out.println("Enter your password :");
        String password = scanner.nextLine();
    }

}
