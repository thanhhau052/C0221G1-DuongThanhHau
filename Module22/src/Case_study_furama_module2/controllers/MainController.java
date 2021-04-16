package Case_study_furama_module2.controllers;

import java.util.Scanner;

import static Case_study_furama_module2.input.Input.*;

public class MainController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {

        int number;
        do {
            System.out.println("" +
                    "1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n"
            );
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationOfCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("You input error!!!");
            }
        }
        while (number != 7);
    }

    private void showInformationOfEmployee() {
    }

    private void addNewBooking() {
    }

    private void showInformationOfCustomer() {
    }

    private void addNewCustomer() {
    }


    // cac case con thieu .........
    private void addNewServices() {


        int numAddServices;

        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("Enter a number : ");
            numAddServices = scanner.nextInt();
            switch (numAddServices) {
                case 1:
                    inputVilla();
                    break;
                case 2:
                    inputHouse();
                    break;
                case 3:
                    inputRoom();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    break;
                default:

                    System.out.println("You input error");
            }

        } while (numAddServices != 6);


    }


    private void showServices() {
        int numVilla;

        do {
            System.out.println("" +
                    "1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");

            System.out.println("Enter a number villa : ");
            numVilla = scanner.nextInt();
            switch (numVilla) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    ShowAllNameVilla();
                    break;
                case 5:
                    showAllNameHouse();
                    break;
                case 6:
                    showAllNamName();
                    break;
                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("You input error!");


            }
        } while (numVilla != 8);


    }


    private void showAllNamName() {
        // code o day
    }

    private void showAllNameHouse() {
        // code o day
    }

    private void ShowAllNameVilla() {
        // code o day
    }

    private void showAllRoom() {
        // code o day
    }

    private void showAllHouse() {
        // code o day
    }


    private void showAllVilla() {
        // code o day
    }
}