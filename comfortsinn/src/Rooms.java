import java.util.ArrayList;

public class Rooms {
    ArrayList<Room> rooms = new ArrayList<>();
    public Rooms() {

    }

    public ArrayList<Room> setRooms() {
        Room room1 = new Room(101 , RoomTypes.SINGLE );
        rooms.add( room1 );
        Room room2 = new Room(102 , RoomTypes.SINGLE );
        rooms.add( room2 );
        Room room3 = new Room(103 , RoomTypes.SINGLE );
        rooms.add( room3 );
        Room room4 = new Room(104 , RoomTypes.SINGLE );
        rooms.add( room4 );
        Room room5 = new Room(105 , RoomTypes.SINGLE );
        rooms.add( room5 );
        Room room6 = new Room(106 , RoomTypes.SINGLE );
        rooms.add( room6 );
        Room room7 = new Room(107 , RoomTypes.SINGLE );
        rooms.add( room7 );
        Room room8 = new Room(108 , RoomTypes.SINGLE );
        rooms.add( room8 );
        Room room9 = new Room(109 , RoomTypes.SINGLE );
        rooms.add( room9 );
        Room room10 = new Room(201 , RoomTypes.DOUBLE);
        rooms.add( room10 );
        Room room11 = new Room(202 , RoomTypes.DOUBLE);
        rooms.add( room11 );
        Room room12 = new Room(203 , RoomTypes.DOUBLE );
        rooms.add( room12 );
        Room room13 = new Room(204 , RoomTypes.DOUBLE );
        rooms.add( room13 );
        Room room14 = new Room(205 , RoomTypes.DOUBLE );
        rooms.add( room14 );
        Room room15 = new Room(301 , RoomTypes.SUITE );
        rooms.add( room15 );
        Room room16 = new Room(302 , RoomTypes.SUITE);
        rooms.add( room16 );
        Room room17 = new Room(303 , RoomTypes.SUITE);
        rooms.add( room17 );
        Room room18 = new Room(304 , RoomTypes.SUITE);
        rooms.add( room18 );
        Room room19 = new Room(305 , RoomTypes.SUITE);
        rooms.add( room19 );
        return rooms;
    }
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public void addRoom(int roomNumber, RoomTypes type  ) {
        Room newRoom = new Room(roomNumber , type );
        rooms.add(newRoom);
    }
    public void removeRoom(int roomNumber) {
        rooms.remove(roomNumber -1 );
    }
    public Room getRoom(int roomNumber) {
        return rooms.get(roomNumber -1 );
    }
    public void getAvailableRooms() {
        System.out.println("Available rooms are:");
        for (Room room : rooms) {
            if (room.getStatus() == RoomStatus.AVAILABLE) {
                System.out.printf("Room number :"+room.getRoomNumber()+" |  Type : "+ room.getRoomType()+" : "+ room.getPrice()+"| Room status "+ room.getStatus()+"\n");
            }

        }
    }
    public void getOccupiedRooms() {
        System.out.println("Occupied rooms:");
        for (Room room : rooms) {
            if (room.getStatus() == RoomStatus.OCCUPIED) {
                System.out.println("Room number :"+room.getRoomNumber()+" |  Type : "+ room.getRoomType()+"| Room status :"+room.getStatus()+"\n");
            }
        }
    }

    public void getRoomsUnderMaintenance(){
        for (Room room : rooms) {
            if(room.getStatus() == RoomStatus.MAINTENANCE) {
                System.out.println("Room number :"+room.getRoomNumber()+" |  Type : "+ room.getRoomType()+" marked as unavailable for :"+room.getStatus()+"\n");
            }
        }
    }

}
