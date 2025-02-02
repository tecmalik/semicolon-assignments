package diary;

import java.util.Scanner;

public class DiaryApplication {

    static Diaries diaries = new Diaries();
    static String username , password;
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
            print("unlock Diary");
            username = input("Enter Diary Username: ");
            password = input("Enter Diary Password: ");
            Diary mydiary = diaries.findByUsername(username, password);
            mydiary.unlock(password);
            print("Welcome"+diaries.findByUsername(username, password).getUserName());
            diaryMenu();
        }catch(IllegalArgumentException e){
            print("Invalid details");
        }finally {
            menu();
            print("invalid details");
        }
    }

    public static void diaryMenu(){
        try {
            String prompt2 = """
                    1-> view Entries.
                    2-> Create New Entry.
                    3-> Find Entry by Id.
                    4-> Update Entry.
                    5-> delete Entry.
                    6-> back to main Menu.
                    7-> Exit.
                    """;
            int userChoice = intInput(prompt2);
            switch (userChoice) {
                case 1:display();
                break;
                case 2:createNewEntry();
                break;
                case 3:findEntryByID();
                break;
                case 4:updateEntry();
                break;
                case 5: deleteEntry();
                break;
                case 6: backToMenu();
                break;
                case 7:System.exit(0);
                default : print("Invalid Choice");
            }
        }catch(IllegalArgumentException e){
            print("Enter number be between 1 and 7");
        }finally{
            menu();
        }

    }

    private static void display() {
        try {
            Diary myDiary = diaries.findByUsername(username, password);
            myDiary.getEntryTitles();
        }catch(NullPointerException e){
            print("Entry is empty");
        }

    }

    private static void backToMenu() {
        diaries.findByUsername(username,password).lock();
        menu();
    }

    private static void deleteEntry() {
        try{
            String username = input("Enter Diary Username: ");
            String password = input("Enter Diary Password: ");
        int entryIDNumber = intInput("Enter Entry ID: ");
        Diary mydiary = diaries.findByUsername(username, password);
            mydiary.unlock(password);
            mydiary.deleteEntry(entryIDNumber);
        }catch(IllegalArgumentException e ){
            print("Invalid details");
        }finally {
           menu();
        }
    }

    private static void updateEntry() {
        try{
            int entryIdNumber = intInput("Enter Entry entry ID: ");
            String updatedBody = input("Enter Entry Title: ");
            String updatedTitle = input("Enter Entry title: ");
            diaries.findByUsername(username, password).updateEntry(entryIdNumber, updatedTitle, updatedBody);
            print("Entry updated successfully");
        }catch(IllegalArgumentException e){
            print("Invalid details");
        }finally{
            diaryMenu();
        }
    }

    private static void findEntryByID() {
        try {
            int idNumber = intInput("Enter Entry ID: ");
            Entry foundEntry = diaries.findByUsername(username, password).findEntryById(idNumber);
            print("Entry" + foundEntry.getTitle() + " found successfully");
            print(foundEntry.getBody());
        }catch(IllegalArgumentException e){
            print("Invalid details");
        }catch (NullPointerException e){
            print("text should not empty");
        }finally{
            diaryMenu();
        }

    }

    private static void createNewEntry() {
        try {
            String title = input("Enter Diary title: ");
            String body = inputLine("Enter Diary description: ");
            Diary myDiary = diaries.findByUsername(username, password);
            myDiary.createEntry(title, body);
            print("Entry successfully created");
        }catch (IllegalArgumentException e){
            print(" diary lock");
        }catch (NullPointerException e){
            print("text should not empty");
        }finally{
            diaryMenu();
        }
    }

    private static void createNewDiary() {
        try{
            username = input("Enter New Diary Username: ");
            password = input("Enter Diary password: ");
        diaries.add(username, password);
        print("New diary created successfully");
        }catch(IllegalArgumentException e){
            print("Invalid details");
        }catch (NullPointerException e){
            print("space cant be Empty spaces");
        }finally {
            diaryMenu();
        }
    }

    public static String input(String message){
        Scanner input = new Scanner(System.in);
        print(message);
        return input.next();
    }
    public static String inputLine(String message){
        Scanner input = new Scanner(System.in);
        print(message);
        return input.nextLine();
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
