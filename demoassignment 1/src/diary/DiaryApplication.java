package diary;

import bankaccount.InvalidAccountException;

import java.io.*;
import java.util.Scanner;

public class DiaryApplication {

    static Diaries diaries = new Diaries();
    static String username , password;
    public static void main(String[] args) {

      //  readExistingDiaries();
        menu();



    }

    private static void readExistingDiaries() {
        diaries = null;
        try(FileInputStream fileIn = new FileInputStream("diary.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn)){
            diaries = (Diaries) in.readObject();
            print("Reading previous files");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void saveDiaries() {

        try (FileOutputStream fileOutput = new FileOutputStream("diaries.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOutput)){
            out.writeObject(diaries);
            print("Diaries saved");
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void menu(){
        try {
            String prompt = """
                    1-> Create New Diary.
                    2-> Find Diary.
                    3-> delete Diary.
                    4-> Exit Program.
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
                    saveDiaries();
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
            Diary mydiary = diaries.findByUsername(username);
            mydiary.unlock(password);
            print("Welcome "+diaries.findByUsername(username).getUserName());
            diaryMenu();
        }catch(IllegalArgumentException e){
            print("No Diary in DataBase");
        }catch (NullPointerException e ) {
            print("input can't be Empty");
        }catch (InvalidAccountException e) {
            print("Username not found");
        }finally {
            menu();
        }
    }

    public static void diaryMenu(){
        try {
            String prompt2 = """
                    1-> View Entry Titles & ID.
                    2-> view All Entries.
                    3-> Create New Entry.
                    4-> Find Entry by Id.
                    5-> Update Entry.
                    6-> delete Entry.
                    7-> back to main Menu.
                    8-> Exit Program.
                    """;
            int userChoice = intInput(prompt2);
            switch (userChoice) {
                case 1: displayAllTitles();
                break;
                case 2: displayAllEntries();
                break;
                case 3:createNewEntry();
                break;
                case 4:findEntryByID();
                break;
                case 5: updateEntry();
                break;
                case 6: deleteEntry();
                break;
                case 7:backToMenu();
                break;
                case 8:saveDiaries();
                    System.exit(0);
                break;
                default : print("Invalid Choice");
            }
        }catch(IllegalArgumentException e){
            print("Enter number be between 1 and 7");
        }finally{
            menu();
        }

    }

    private static void displayAllTitles() {
        try{
            Diary myDiary = diaries.findByUsername(username);
            print(myDiary.getAllTitles());
        }catch (IllegalArgumentException e){
            print("Entry is empty");
        }finally {
            diaryMenu();
        }

    }

    private static void displayAllEntries() {
        try {
            Diary myDiary = diaries.findByUsername(username);
            print(myDiary.getAllEntries());
        }catch(NullPointerException e){
            print("Entry is empty");
        }finally {
            diaryMenu();
        }

    }

    private static void backToMenu() {
        diaries.findByUsername(username).lock();
        menu();
    }

    private static void deleteEntry() {
        try{
            String username = input("Enter Diary Username: ");
            String password = input("Enter Diary Password: ");
        int entryIDNumber = intInput("Enter Entry ID: ");
        Diary mydiary = diaries.findByUsername(username);
            mydiary.unlock(password);
            mydiary.deleteEntry(entryIDNumber);
            print("Deleted Successfully");
        }catch(IllegalArgumentException e ){
            print("Invalid Entry !!!");
        }finally {
           diaryMenu();
        }
    }

    private static void updateEntry() {
        try{
            int entryIdNumber = intInput("Enter Entry entry ID: ");
            String updatedTitle = inputLine("Enter Entry Title: ");
            String updatedBody = inputLine("Enter Entry Body: ");
            diaries.findByUsername(username).updateEntry(entryIdNumber, updatedTitle, updatedBody);
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
            Entry foundEntry = diaries.findByUsername(username).findEntryById(idNumber);
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
            String title = inputLine("Enter Diary Entry Title: ");
            String body = inputLine("Enter Diary Entry Body : ");
            Diary myDiary = diaries.findByUsername(username);
            myDiary.createEntry(title, body);
            print("Entry successfully Saved");
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
