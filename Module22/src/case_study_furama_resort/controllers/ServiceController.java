package case_study_furama_resort.controllers;

import case_study_furama_resort.modol.House;
import case_study_furama_resort.modol.Room;
import case_study_furama_resort.modol.Villa;
import case_study_furama_resort.service.*;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ServiceController {
    private static ServiceInterface villaService = new VillaServiceImpl();
    private static ServiceInterface houseService = new HouseServiceImpl();
    private static ServiceInterface roomService = new RoomServiceImpl();

//    =============================== ADD NEW SERVICE ===============================
    public static void addVillaService(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>> How many villa services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        List<Villa> villaList = FuncReadServicesFileCSV.readFileCSVVilla();
        for ( int i = 0; i < length; i++){
            Villa villa = (Villa) villaService.addNewService();
            villaList.add(villa);
        }
        FuncWriteServicesFileCSV.writeFileCSVVilla(villaList);
        MainController.processMain();
    }

    public static void addHouseService(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>> How many houses services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        List<House> houseList = FuncReadServicesFileCSV.readFileCSVHouse();

        for ( int i = 0; i < length; i++){
            House house = (House) houseService.addNewService();
            houseList.add(house);
        }
        FuncWriteServicesFileCSV.writeFileCSVHouse(houseList);
        MainController.processMain();
    }

    public static void addRoomService(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>> How many rooms services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        List<Room> roomList = FuncReadServicesFileCSV.readFileCSVRoom();

        for ( int i = 0; i < length; i++){
            Room room = (Room) roomService.addNewService();
            roomList.add(room);
        }
        FuncWriteServicesFileCSV.writeFileCSVRoom(roomList);
        MainController.processMain();
    }
    //=============================== SHOW SERVICE ===============================
    public static void showAllVillaServices(){
        List<Villa> villaList = FuncReadServicesFileCSV.readFileCSVVilla();
        for(Villa element : villaList){
            System.out.println(element.showInfor());
        }
    }

    public static void showAllHouseServices(){
        List<House> list = FuncReadServicesFileCSV.readFileCSVHouse();
        for(House element : list){
            System.out.println(element.showInfor());
        }
    }

    public static void showAllRoomServices(){
        List<Room> list = FuncReadServicesFileCSV.readFileCSVRoom();
        for(Room element : list){
            System.out.println(element.showInfor());
        }
    }

    public static void showAllServicesNotDuplicate(String path){
        TreeSet<String> nameList = FuncReadServicesFileCSV.getAllNameServiceFromFileCSV(path);
        for(String element: nameList){
            System.out.println(element);
            System.out.println("====================");
        }
    }
}