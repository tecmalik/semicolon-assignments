package diary;

import java.util.Scanner;

public class DiaryApplication {

    static Diaries diaries = new Diaries();
    public static void main(String[] args) {

            menu();

    }


    public static void menu(){
        try {
            String prompt = """
                    1-> Create New Diary.
                    2-> Find Diary.
                    3-> delete Diary.
                    4-> Exit.
                    """;
            int userChoice = intInput(prompt);
            switch (userChoice) {
                case 1:
                    createNewDiary();
                    break;
                case 2:
                    findDiary();
                    break;
                case 3:
                    deleteDiary();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    print("Invalid Choice");
            }
        }catch(IllegalArgumentException e){
            print("Input Must be a Digit");
        }finally{
            menu();
        }

    }

    private static void deleteDiary() {
        try {
            String username = input("Enter Diary name: ");
            String Password = input("Enter Diary password: ");
            diaries.delete(username, Password);
            print("Deleted sucessfully");
        }catch(IllegalArgumentException e){
            print("Invalid details");
        }finally {

            menu();
        }

    }

    private static void findDiary() {
        try {
            String username = input("Enter Diary Username: ");
            String password = input("Enter Diary Password: ");
            diaries.findByUsername(username, password);
            print("Found "+diaries.findByUsername(username, password).getUserName()+" successfully ");
        }catch(IllegalArgumentException e){
            print("Invalid details");
        }finally {

            diaryMenu();
        }
    }

    public static void diaryMenu(){
        try {
            String prompt2 = """
                    1-> Create New Diary Entry.
                    2-> Find Diary Entry by Id.
                    3-> lockDiary.
                    4-> update Entry
                    5-> delete DiaryEntry.
                    6-> back to main Menu
                    7-> Exit.
                    """;
            int userChoice = intInput(prompt2);
            switch (userChoice) {
                case 1:
//                    createNewDiaryEntry();
                    break;
//            case 2:findDiaryEntryByID();
//            break;
//            case 3:deleteDiary();
//            break;
//            case 4:exit();
//            break;
                default:
                    print("Invalid Choice");
            }
        }catch(IllegalArgumentException e){
            print("Enter number be between 1 and 7");
        }finally{
            menu();
        }

    }

    private static void createNewDiary() {
        try{
        String username = input("Enter Diary name: ");
        String Password = input("Enter Diary password: ");
        diaries.add(username, Password);
        }catch(IllegalArgumentException e){
            print("Invalid details");
        }catch (NullPointerException e){
            print("space cant be Empty spaces");
        }finally {
            diaryMenu();
            print("Diary was created Success fully.");
        }
    }

    public static String input(String message){
        Scanner input = new Scanner(System.in);
        print(message);
        return input.next();
    }
    public static int intInput(String message){
        Scanner input = new Scanner(System.in);
        print(message);
        return input.nextInt();
    }
    public static void print(String message){
        System.out.println(message);
    }

}
