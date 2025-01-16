import java.math.BigDecimal;

public class Room {
    private int roomNumber;
    private RoomTypes roomType;
    private RoomStatus  Status;
    private static int count = 0;

    public Room(int roomNumber, RoomTypes roomType ) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.Status = RoomStatus.AVAILABLE;
        count++;
    }


    public void setRoomNumber( int roomNumber ) {

        this.roomNumber = roomNumber;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomType( RoomTypes roomType ) {
        this.roomType = roomType;
    }
    public RoomTypes getRoomType() {
        return roomType;
    }
    public void setStatus(RoomStatus status) {

        this.Status = status;
    }
    public RoomStatus getStatus() {
        return Status;
    }
    public int getcount(){
        return count;
    }
    public BigDecimal getPrice() {
        return roomType.getAmount();
    }

}
