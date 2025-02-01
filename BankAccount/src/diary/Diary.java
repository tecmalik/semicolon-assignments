package diary;

import java.util.ArrayList;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked;
    private ArrayList<Entry> entries = new ArrayList<>();
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
    public boolean verifyPassword(String password) {
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
            return ++this.count;
    }
    public void deleteEntry(int entryIDNumber) {
        if(entryIDNumber == 0 ) throw new IllegalArgumentException("Number has to be greater than 0");
        if(isInValid(entryIDNumber)) throw new IllegalArgumentException("EntryIDNumber Does Not Exist");
        entries.removeIf(entry -> entry.getId() == entryIDNumber);

    }

    public Entry findEntryById(int entryIdNumber) {
        for(Entry entry : entries) {
            if(entry.getId() == entryIdNumber) {
                return entry;
            }
        }
       throw new IllegalArgumentException("EntryIDNumber Does Not Exist");
    }


    public void updateEntry(int entryIDNumber, String updatedTitle, String updatedBody) {
        if(isInValid(entryIDNumber))throw new IllegalArgumentException("EntryIDNumber Does Not Exist");
        findEntryById(entryIDNumber).setBody(updatedBody);
        findEntryById(entryIDNumber).setTitle(updatedTitle);
    }

    private boolean isInValid(int entryIDNumber) {
        return entryIDNumber < 1 || entryIDNumber > entries.size();
    }
    public String getUserName(){
        return this.userName;
    }
}

