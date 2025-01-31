package diary;

import java.time.LocalDate;

public class Entry {
    private int idNumber = 0;
    private String title;
    private String Body;
    private LocalDate date;

    Entry(int idNumber, String title, String body) {
        this.title = title;
        this.Body = body;
        this.idNumber = idNumber  ;
        this.date = LocalDate.now();
    }
    public int getId() {
        return idNumber;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return Body;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setBody(String body) {
        this.Body = body;
    }
}
