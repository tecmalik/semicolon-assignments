public class DiaryEntry {
    private String userId;
    private String entryHeading;
    private String diaryBody;

    public void setEntryName(String userId ,String entryHeading ) {
        this.userId = userId;
        this.entryHeading = entryHeading;
    }
    public void setDiaryBody(String diaryBody) {
        this.diaryBody = diaryBody;
    }
    public String getUserId() {

        return this.userId;
    }
    public String getEntryHeading() {
        return entryHeading;
    }
    public String getDiaryBody() {

        return diaryBody;
    }

    public void setEntryHeading(String entryHeading) {
        this.entryHeading = entryHeading;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
}

