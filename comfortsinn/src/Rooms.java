public class Rooms {

   private String roomNumber;
   private RoomType roomType;
   private String roomStatus;

    public Rooms(String roomNumber, RoomType roomType, String roomStatus) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomStatus = roomStatus;
    }


   public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
   }
    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
    public RoomType getRoomType() {
        return roomType;
    }
    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }
    public String getRoomStatus() {
        return roomStatus;
    }
}
