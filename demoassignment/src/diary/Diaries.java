package diary;

import java.util.ArrayList;

public class Diaries {
   private final ArrayList<Diary> diaries = new ArrayList<>();


    public void add(String username, String password) {
        if(password == null) throw new NullPointerException("password cant be empty");
        if(username == null ) throw new NullPointerException("username cant be empty");
        Diary diary = new Diary(username, password);
        diaries.add(diary);
    }

    public int size() {
        return diaries.size();
    }

    public void delete(String username, String password) {
        for (Diary diary : diaries) {
            if(!diary.verifyPassword(password)) {
                throw new IllegalArgumentException("Passwords do not match");
            }
        }
        diaries.removeIf(diary -> diary.verifyPassword(password) && diary.getUserName().equals(username));
    }

    public Diary findByUsername(String username) {
        for (Diary diary : diaries) {
            if ( diary.getUserName().equals(username)) {
                return diary;
            }
        }
        throw new IllegalArgumentException("Username not found");
    }
}
