package zoo;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Room> roomList;

    public Zoo() {
        roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);

    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    public void removeRoom(int roomCode) {
        for (Room room : roomList) {
            if(room.getRoomCode() == roomCode) {
                roomList.remove(room);
                break;
            }
        }
    }

    public void display() {
        for (Room room : roomList) {
            room.display();
        }
    }
}