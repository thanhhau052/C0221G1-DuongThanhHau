package case_study_furama_resort.service;

import case_study_furama_resort.modol.Services;

import java.util.Scanner;

public class CommonServiceImpl{
    void addCommonServiceInfo(Services services){
        Scanner input = new Scanner(System.in);
        System.out.println("ID: ");
        services.setId(input.nextLine());

        System.out.println("Service Name: ");
        services.setServiceName(input.nextLine());

        System.out.println("Area of Use ");
        services.setAreaUsing(Float.parseFloat(input.nextLine()));

        System.out.println("Rental Fee ");
        services.setrentalFee(Double.parseDouble(input.nextLine()));

        System.out.println("Max Occupancy: ");
        services.setmaxOccupancy(Integer.parseInt(input.nextLine()));

        System.out.println("Type of Rent: ");
        services.setTypeRental(input.nextLine());
    }
}
