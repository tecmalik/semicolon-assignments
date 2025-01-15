import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;



public class Booking {
    private String bookingReferenceNumber;
    private String customerId;
    private String checkInDate;
    private String checkOutDate;
    private int totalBookings;
    private static int count = 0;

    ArrayList<Guest> guests = new ArrayList<>();


    public Booking(String bookingReferenceNumber, String customerId, String checkInDate, String checkOutDate, int totalBookings) {
        this.bookingReferenceNumber = bookingReferenceNumber;
        this.customerId = customerId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalBookings = totalBookings;

        count++;
    }

    public void setBookingReferenceNumber(String bookingReferenceNumber) {
        this.bookingReferenceNumber = bookingReferenceNumber;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCheckInDate() {
        Date date = new Date();
        this.checkInDate = date.toString();
    }

    public void setCheckOutDate(String checkOutDate) {

        this.checkOutDate = checkOutDate;
    }

    public void setTotalBookings(int totalBookings) {
        this.totalBookings = totalBookings;
    }

    public String getBookingReferenceNumber() {
        return bookingReferenceNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public int getTotalBookings() {
        return totalBookings;
    }

    public String referenceNumberGenerator() {
        int number = count;
        DecimalFormat formatter = new DecimalFormat("0000");
        return String.format("REF%40d", number);
    }

    public String generateCustomerID() {
        String userID = " ";
        Random random = new Random();
        String characters = "123456789abcdefghijklmnoprstuvwxyz_!@#$%^&*IO";
        for (int count = 0; count < 5; count++) {
            int randomIndex = random.nextInt(characters.length());
            userID += randomIndex;
        }
    return userID;
    }

}