import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;

public class Booking {
    private String bookingReferenceNumber;
    private String customerId;
    private String checkInDate;
    private String CheckOutDate;
    private int totalBookings;
    private static int count = 0;


    ArrayList<Integer> bookings = new ArrayList<>();

    public Booking(String bookingReferenceNumber, String customerId, String checkInDate, String checkOutDate, int totalBookings) {
        this.bookingReferenceNumber = bookingReferenceNumber;
        this.customerId = customerId;
        this.checkInDate = checkInDate;
        this.CheckOutDate = checkOutDate;
        this.totalBookings = totalBookings;

        count++;
    }

    public void setBookingReferenceNumber(String bookingReferenceNumber) {
       this.bookingReferenceNumber = bookingReferenceNumber;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }
    public void setCheckOutDate(String checkOutDate) {
        this.checkInDate = checkOutDate;
    }
    public void setTotalBookings(int totalBookings) {
        this.totalBookings = totalBookings;
    }
    public void setBookings(ArrayList<Integer> bookings) {
        this.bookings = bookings;
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
        return CheckOutDate;
    }
    public int getTotalBookings() {
        return totalBookings;
    }

    public String referenceNumberGenerator() {
        int number = count;
        DecimalFormat formatter = new DecimalFormat("0000");
        return String.format("REF%40d",number);
    }

}
