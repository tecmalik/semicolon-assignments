public class Rooms {
    private int roomNumber;
    private RoomTypes roomType;
    private RoomStatus  Status;



    public Rooms(int roomNumber, RoomTypes roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.Status = RoomStatus.AVAILABLE;
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


}
