package case_study_furama_resort.service;

import case_study_furama_resort.modol.Room;
import case_study_furama_resort.modol.Services;

import java.util.Scanner;

public class RoomServiceImpl extends CommonServiceImpl implements ServiceInterface {
    @Override
    public Services addNewService() {
        Scanner input = new Scanner(System.in);
        Services room = new Room();

        super.addCommonServiceInfo(room);

        System.out.println("Complimentary of Room: ");
        ((Room) room).setComplimentary(input.nextLine());

        return room;
    }
}