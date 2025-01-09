import java.util.ArrayList;
import java.util.Random;

public class Diary {
        private String username;
        private String password;
        private boolean islocked ;
        static ArrayList<DiaryEntry> entryMemory = new ArrayList<>();

    public void setDiary(String username , String password) {
        this.username = username;
        this.password = password;
        islocked = false;
    }
    public String getUsername() {
        return username;
    }
    public void islocked( ) {
        islocked = true;
    }


    public String userIDChecker(String userID) {
        boolean isCommon = true;
        while(isCommon) {
        for (int count = 0; count < entryMemory.size(); count++) {
            if((entryMemory.get(count).getUserId()).equals(userID)) {
                userIDChecker(createEntryId());
            }
            else {
                isCommon = false;
            }
        }
        }
        return userID;
    }

    public String createEntryId(){
        String userID = " ";
        Random random = new Random();
        String characters = "123456789abcdefghijklmnoprstuvwxyz_!@#$%^&*IO";
        for (int count = 0; count < 5; count++) {
            int randomIndex = random.nextInt(characters.length());
            userID += randomIndex;
        }
    return userID;
    }
    public void unlockDiary(String username,String password ) {
        if(username.equals(getUsername()) && password.equals(getUsername())){
            islocked = false;
        }
    }

    public DiaryEntry findEntryById(String entryId) {
        if( entryMemory.size() > 0){
            int elementIndex = 0;
            for (int index = 0; index < entryMemory.size(); index++) {
                 if ((entryMemory.get(index).getUserId()).contains(entryId)){
                     elementIndex  = index ;
                     DiaryEntry diaryEntry = entryMemory.get(elementIndex);
                     return diaryEntry;
                 }
            }

        }
       return null ;
    }
    public void addEntry(String entryName, String entryBody) {
        DiaryEntry entry = new DiaryEntry();
        entry.setEntryName( entryName, entryBody);
        entry.setDiaryBody(entryBody);
        entryMemory.add(entry);

    }
    public void deleteEntry( int number) {
        if( entryMemory.size() > 0 && number<entryMemory.size() ) {
            entryMemory.remove(number - 1);
        }
    }
    public String updateEntryHeading(String userID , String entryHeading) {
        if( entryMemory.size() > 0 ) {
            for (int count = 0; count < entryMemory.size(); count++) {
                if (entryMemory.get(count).getUserId().equals(userID)) {
                    DiaryEntry entry = new DiaryEntry();
                    entryMemory.get(count).setEntryHeading(entryHeading);
                    return "updated Entry Heading";
                }

            }
        }
    return null;
    }

    public String updateEntryBody( String userID , String entryHeading) {
        if ( entryMemory.size() > 0 ) {
            for (int count = 0; count < entryMemory.size(); count++) {
                if (entryMemory.get(count).getUserId().equals(userID)) {
                    DiaryEntry entry = new DiaryEntry();
                    entryMemory.get(count).setUserId(entryHeading);
                }
            }
        }
        return null;
    }
}
