package diary;

import java.util.Scanner;

public class DiaryApplication {

    static Diaries diaries = new Diaries();
    public static void main(String[] args) {

            menu();

    }


    public static void menu(){
        String prompt = """
                        1-> Create New Diary.
                        2-> Find Diary.
                        3-> delete Diary.
                        4-> Exit.
                        """;
        int userChoice = intInput(prompt);
        switch (userChoice){
            case 1 :createNewDiary();
            break;
            case 2:findDiary();
            break;
            case 3:deleteDiary();
            break;
            case 4:System.exit(0);
            break;
            default: print("Invalid Choice");
        }

    }

    private static void deleteDiary() {
        try {
            String username = input("Enter Diary name: ");
            String Password = input("Enter Diary password: ");
            diaries.delete(username, Password);
        }catch(IllegalArgumentException e){
            print("Invalid details");
        }finally {
            print("Deletedsucessfully");
            menu();
        }

    }

    private static void findDiary() {
        try {
            String username = input("Enter Diary Username: ");
            String password = input("Enter Diary Password: ");
            diaries.findByUsername(username, password);
        }catch(IllegalArgumentException e){
            print("Invalid details");
        }finally {
            print(" Diary was never found.");
            menu();
        }
    }

    public static void diaryMenu(){
        String prompt2 = """
                        1-> unlockDiary.
                        2-> Create New Diary Entry.
                        3-> lockDiary.
                        4-> delete DiaryEntry.
                        5-> find Entry by Id.
                        6-> update Entry
                        7-> back to main Menu
                        8-> Exit.
                        """;
        int userChoice = intInput(prompt2);
        switch (userChoice){
            case 1 :createNewDiary();
            break;
//            case 2:findDiary();
//            break;
//            case 3:deleteDiary();
//            break;
//            case 4:exit();
//            break;
            default: print("Invalid Choice");
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
