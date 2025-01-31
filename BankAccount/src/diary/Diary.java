package diary;

import java.util.ArrayList;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked;
    ArrayList<Entry> entries = new ArrayList<>();

    Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.isLocked = false;
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
        Entry entry = new Entry( idnumber(),title ,body);
    }
}
