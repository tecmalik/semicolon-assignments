import java.text.DecimalFormat;

public class Guest {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
   private static int count = 0;


    public Guest(String firstName, String lastName, String email, String phoneNumber,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        count++;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getPassword() {
        return password;
    }

    public boolean checkPhoneNumber(String phoneNumber) {
        boolean isValidNot = true;
        while (isValidNot) {
            for(int count = 0; count<phoneNumber.length(); count++){
                if(phoneNumber.charAt(count) >= 12 && phoneNumber.charAt(count) > 0 ) {
                    isValidNot = false;
                }
            }
        }
        return true;
    }



}
