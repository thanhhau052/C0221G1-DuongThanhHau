package case_study_furama_resort.views;

import case_study_furama_resort.controllers.MainController;
import case_study_furama_resort.controllers.ServiceController;

import java.util.Scanner;

public class Menu {
    public static void displayMainMenu(){
        System.out.println("MENU\n" +
                "1.\tAdd New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");
        System.out.println("Enter a number : ");
    }

    public static void menuAddNewServices() {
        System.out.println("ADD NEW SERVICE:\n" +
                "1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        Scanner input = new Scanner(System.in);
        switch (input.nextLine()){
            case "1":
                ServiceController.addVillaService();
                break;
            case "2":
                ServiceController.addHouseService();
                break;
            case "3":
                ServiceController.addRoomService();
                break;
            case "4":
                MainController.processMain();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Fail. Please choose number of menu exactly. Enter to continue...");
                MainController.processMain();
                break;
        }
    }

    public static void menuShowServices(){
        System.out.println("SHOW SERVICES:\n" +
                "1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number){
            case 1:
                ServiceController.showAllVillaServices();
                break;
            case 2:
                ServiceController.showAllHouseServices();
                break;
            case 3:
                ServiceController.showAllRoomServices();
                break;
            case 4:
                ServiceController.showAllServicesNotDuplicate("src/data/villas.csv");
                break;
            case 5:
                ServiceController.showAllServicesNotDuplicate("src/data/houses.csv");
                break;
            case 6:
                ServiceController.showAllServicesNotDuplicate("src/data/rooms.csv");
                break;
            case 7:
                MainController.processMain();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Fail. Please choose number of menu exactly. Enter to continue...");
                MainController.processMain();
        }
    }
}