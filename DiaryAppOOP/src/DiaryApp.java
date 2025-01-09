import java.util.Scanner;

public class DiaryApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Diary diary = new Diary();
        DiaryEntry diaryEntry = new DiaryEntry();
        System.out.println("Welcome to Diary App");
        System.out.println("Please enter your name: ");
        String name = in.nextLine();
        System.out.println("Please enter your Username : ");
        int userName = in.nextInt();
        System.out.println("Please enter your Password: ");
        int userPassword = in.nextInt();
        System.out.println("confirm password : ");
        String password = in.next();



    }
}