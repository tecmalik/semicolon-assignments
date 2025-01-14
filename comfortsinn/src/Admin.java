import java.util.ArrayList;

public class Admin  {
    private String id;
    private String name;
    private String email;
    private String password;
    private static int count = 0;
    ArrayList<String> admin = new ArrayList<>();
    public Admin(String id, String name, String email,String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = "password";
        count++;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public static int getCount() {
        return count;

    }
    public String getAdminID() {
        String admin = "#Admin_";
        return String.format("%s%d", admin, count);
    }


}
