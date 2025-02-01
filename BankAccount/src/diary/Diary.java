package diary;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked;
    ArrayList<Entry> entries = new ArrayList<>();
    private int count;


    Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.isLocked = true;

    }

    public int numberOfEntry() {
        return entries.size();
    }

    public boolean isLocked() {
        return isLocked;
    }
    public void unlock(String password) {
        if(!verifyPassword(password))throw new IllegalArgumentException("invalid credentials");
        this.isLocked = false;
    }
    private boolean verifyPassword(String password) {
        return this.password.equals(password);
    }
    public void lock() {
        this.isLocked = true;
    }

    public void createEntry(String title, String body) {
        if (title == null || title.isEmpty()) throw new NullPointerException("title is empty");
        if (body == null || title.isEmpty()) throw new NullPointerException("Body can't be empty");
        Entry entry = new Entry( entryIdNumber(),title ,body);
        entries.add(entry);
    }
    private int entryIdNumber() {
            return this.count++;
    }
    public void deleteEntry(int EntryIDNumber) {
        if(EntryIDNumber == 0 ) throw new NullPointerException("Number has to be greater than 0");
        if(EntryIDNumber < 1 || EntryIDNumber > entries.size()) throw new InputMismatchException("EntryIDNumber Does Not Exist");
        entries.removeIf(entry -> entry.getId() == EntryIDNumber);

    }
    
//    public void findEntryById(int entryIdNumber) {
//
//    }


}
