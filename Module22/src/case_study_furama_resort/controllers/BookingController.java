package case_study_furama_resort.controllers;

import case_study_furama_resort.modol.Customer;
import case_study_furama_resort.modol.House;
import case_study_furama_resort.modol.Room;
import case_study_furama_resort.modol.Villa;
import case_study_furama_resort.service.FuncBookingFileCSV;
import case_study_furama_resort.service.FuncCustomerFileCSV;
import case_study_furama_resort.service.FuncReadServicesFileCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingController {
    public static void addnewBooking(){
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> customers = FuncCustomerFileCSV.readFileCSV();

        System.out.println("Sorting by NAME...");
        for(Customer element : customers){
            System.out.println(element.showInfor());
        }

        System.out.println("Which ID customer to make booking?");
        int numCustomer = Integer.parseInt(input.nextLine());
        Customer booking = customers.get(numCustomer-1);

        System.out.println("Which service to make booking?\n"
                +"1.\tBooking Villa\n"
                +"2.\tBooking House\n"
                +"3.\tBooking Room\n");
        switch (input.nextLine()){
            case "1":
                ServiceController.showAllVillaServices();
                List<Villa> villaList = FuncReadServicesFileCSV.readFileCSVVilla();
                System.out.println(">>>>>>>>>>>>>>>> Which ID VILLA to make booking?");
                Villa villa = villaList.get(input.nextInt() -1 );
                booking.setService(villa);
                break;
            case "2":
                ServiceController.showAllHouseServices();
                List<House> houseList = FuncReadServicesFileCSV.readFileCSVHouse();
                System.out.println(">>>>>>>>>>>>>>>> Which ID HOUSE to make booking?");
                House house = houseList.get(input.nextInt() -1 );
                booking.setService(house);
                break;
            case "3":
                ServiceController.showAllRoomServices();
                List<case_study_furama_resort.modol.Room> roomList = FuncReadServicesFileCSV.readFileCSVRoom();
                System.out.println(">>>>>>>>>>>>>>>> Which ID ROOM to make booking?");
                Room room = roomList.get(input.nextInt()-1);
                booking.setService(room);
                break;
        }
        ArrayList<Customer> bookingList = FuncBookingFileCSV.readFileCSV();
        bookingList.add(booking);
        FuncBookingFileCSV.writeFileCSV(bookingList);
        MainController.processMain();
    }
}