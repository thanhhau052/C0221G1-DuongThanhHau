//package luyen_tap_oop;
//
//
//import java.util.ArrayList;
//
//public class Zoo {
//    ArrayList<Room> roomList = new ArrayList<>();
//
//    public void addAnimal(int roomNumber, Animal animal) {
//
//        for (Room room : roomList) {
//            if (roomNumber == room.getRoomNumber()) {
//                room.animalsList.add(animal);
//                return;
//            }
//
//        }
//        System.out.println("khong co room :" + roomNumber);
//
//    }
//
//    public void removeAnimal(int roomNumber, String name) {
//        for (Room r : roomList) {
//            if (r.getRoomNumber() == roomNumber) {
//                for (Animal animal : r.animalsList) {
//                    if (animal.getName().equals(name)) {
//                        r.animalsList.remove(animal);
//                        return;
//                    }
//
//                }
//                System.out.println(" khong tim thay ten !");
//                return;
//            }
//        }
//        System.out.println("khong co room " + roomNumber);
//
//    }
//    public  void addRoom(Room r){
//        roomList.add(r);
//
//    }
//    public void removeRoom(int roomNumber)    {
//        for (Room room: roomList){
//            if (room.getRoomNumber()==roomNumber){
//                roomList.remove(roomNumber);
//                return;
//            }
//
//
//        }
//        System.out.println(" khong tim thay ! ");
//    }
//    public  void display(){
//        for (Room room: roomList){
//            room.display();
//        }
//    }
//
//    public void getRoomList() {
//        System.out.println("roomList");
//    }
//
//
//    public void geRoomList() {
//    }
//}
