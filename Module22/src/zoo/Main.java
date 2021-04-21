package zoo;

import java.util.Scanner;

public class Main {

//    static void method1(int a){  }

    static void method1(float a){  }

    static void method1(int c){  }

    static void method1(double d){  }

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Scanner input = new Scanner(System.in);
        int choose;

        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());

            switch(choose) {
                case 1:
                    System.out.println("Enter number of room: ");
                    int n = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n; i++) {
                        Room room = new Room();
                        room.input();

                        zoo.addRoom(room);
                    }
                    break;
                case 2:
                    System.out.println("nhap room muon xoa: ");
                    int roomCode = Integer.parseInt(input.nextLine());
                    zoo.removeRoom(roomCode);
                    zoo.display();
                    break;
                case 3:
                    addAnimal(zoo);
                    break;
                case 4:
                    removeAnimal(zoo);
                    break;
                case 5:
                    zoo.display();
                    break;
                case 6:
                    System.out.println("Good Bye !");
                    break;
                default:
                    System.out.println("Ban nhap sai !");
                    break;
            }
        } while(choose != 6);
    }

    static void addAnimal(Zoo zoo) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong Animal : ");
        int n = Integer.parseInt(input.nextLine());
        int choose;
        for (int i = 0; i < n; i++) {
            System.out.println("1. them Tiger");
            System.out.println("2. them  Dog");
            System.out.println(" con lai : them  Cat");
            choose = Integer.parseInt(input.nextLine());

            Animal animal;

            switch(choose) {
                case 1:
                    animal = new Tiger();
                    break;
                case 2:
                    animal = new Dog();
                    break;
                default:
                    animal = new Cat();
                    break;
            }
            animal.input();

            System.out.println("Danh sach :");
            Room room = null;
            for (int j = 0; j < zoo.getRoomList().size(); j++) {
                room = zoo.getRoomList().get(j);
                System.out.format("\n(%d) - %s", room.getRoomCode(), room.getRoomName());
            }
            System.out.println("\nnhap so room : ");
            int roomCode = Integer.parseInt(input.nextLine());
            for (int j = 0; j < zoo.getRoomList().size(); j++) {
                room = zoo.getRoomList().get(j);
                if(room.getRoomCode() == roomCode) {
                    break;
                } else {
                    room = null;
                }
            }

            if(room != null) {
                room.addAnimal(animal);
            }
        }
    }

    static void removeAnimal(Zoo zoo) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten Animal ban muon xoa : ");
        String roomName = input.nextLine();

        for (Room room : zoo.getRoomList()) {
            room.removeAnimal(roomName);
        }
    }

    static void showMenu() {
        System.out.println("1. Thêm chuồng");
        System.out.println("2. Xóa chuồng");
        System.out.println("3. Thêm con vật");
        System.out.println("4. Xóa con vật");
        System.out.println("5. Xem tất cả các con vật");
        System.out.println("6. Thoat");
        System.out.println("Choose: ");
    }
}