package diary;

import java.util.ArrayList;

public class Diaries {
   private ArrayList<Diary> diaries = new ArrayList<>();


    public void add(String username, String password) {
        Diary diary = new Diary(username, password);
        diaries.add(diary);
    }

    public int size() {
        return diaries.size();
    }


    public void delete(String username, String password) {
        diaries.removeIf(diary -> diary.verifyPassword(password) && diary.getUserName().equals(username));
    }

    public Diary findByUsername(String username2, String password2) {
        
    }
}
