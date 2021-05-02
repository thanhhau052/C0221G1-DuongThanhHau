package case_study_furama_resort.service;

import case_study_furama_resort.modol.Services;
import case_study_furama_resort.modol.Villa;

import java.util.Scanner;

public class VillaServiceImpl extends CommonServiceImpl implements ServiceInterface {
    @Override
    public Services addNewService() {
        Scanner input = new Scanner(System.in);
        Services villa = new Villa();

        super.addCommonServiceInfo(villa);

        System.out.println("Standard of Room: ");
        ((Villa) villa).setRoomStandard(input.nextLine());

        System.out.println("Facilites: ");
        ((Villa) villa).setFacilites(input.nextLine());

        System.out.println("Area of SwimmingPool: ");
        ((Villa) villa).setAreaSwimmingPool(Float.parseFloat(input.nextLine()));

        System.out.println("Number Of Floor: ");
        ((Villa) villa).setnumberOfFloor(Integer.parseInt(input.nextLine()));

        return villa;
    }
}