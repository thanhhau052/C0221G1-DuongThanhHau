//package luyen_tap_oop;
//
//import zoo.Zoo;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Zoo zoo = new Zoo();
//        Scanner scanner = new Scanner(System.in);
//        int choose;
//        do {
//            showManu();
//            choose = scanner.nextInt();
//            switch (choose) {
//                case 1:
//                    System.out.println(" nhap vao so phong : ");
//                    int num = scanner.nextInt();
//                    for (int i = 0; i < num; i++) {
//                        Room room = new Room();
//                        room.input();
//                        zoo.addRoom(room);
//
//                    }
//                    break;
//                case 2:
//                    System.out.println("Nhap vao ten room ban muon xoa  : ");
//                    int numDelete=scanner.nextInt();
//                    zoo.removeRoom(numDelete);
//                    break;
//                case 3:
//              addAnimal(zoo) ;
//              break;
//                case 4:
//                    removeAnimal(zoo);
//                case 5:
//                    zoo.display();
//                    break;
//                case 6:
//                    System.out.println("Exit");
//                    break;
//                default:
//                    System.out.println("Khong tim thay ! ");
//
//
//            }
//        } while (choose != 6);
//    }
//
//    private static void removeAnimal(Zoo zoo) {
//    }
//
//    private static void addAnimal(Zoo zoo) {
//        Scanner scanner= new Scanner(System.in);
//        System.out.println(" Nhap vao so luong Animal : ");
//        int numAnimal=scanner.nextInt();
//        int choose;
//        for (int i= 0 ;i<numAnimal; i++){
//            System.out.println("" +
//                    "    1. Tiger\n" +
//                    "    2. Dog\n" +
//                    "    3. Cat");
//        }
//        choose=scanner.nextInt();
//        Animal animal = null;
//        switch (choose){
//
//            case 1:
//               animal =new Tiger();
//               break;
//            case 2:
//                 animal=new Dog();
//                 break;
//            case 3:
//                animal=new Cat();
//                break;
//            default:
//                System.out.println("ko co trong danh sach ! ");
//        }
//        animal.input();
//        System.out.println("Rom List : ");
//        Room room =null;
//        for (int i=0;i<zoo.getRoomList().size(); i++){
////            room = zoo.getRoomList().get
//
//        }
//    }
//
//    private static void showManu() {
//    }
//
//}
