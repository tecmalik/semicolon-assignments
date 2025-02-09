package diary;

import bankaccount.InvalidAccountException;

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
        if(password == null) throw new NullPointerException("password cant be empty");
        if(username == null ) throw new NullPointerException("username cant be empty");
        Diary diaryToBeDeleted = findByUsername(username);
        if(!diaryToBeDeleted.verifyPassword(password)) throw new IllegalArgumentException("Invalid details");
        diaries.remove(diaryToBeDeleted);

    }


    public Diary findByUsername(String username) {

        if(username == null) throw new NullPointerException("username cant be empty");
        if(diaries.isEmpty()) throw new IllegalArgumentException("no Diary in database");
        int matchedDiary = 0;
        for (Diary diary : diaries) {
            if ( diary.getUserName().equals(username)){
                ++matchedDiary;
                return diary;
            }
        }
        if(matchedDiary == 0)throw new InvalidAccountException("Invalid account");
        throw new IllegalArgumentException("Username not found");
    }
}
