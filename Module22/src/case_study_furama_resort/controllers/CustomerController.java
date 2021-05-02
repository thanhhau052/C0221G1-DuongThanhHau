package case_study_furama_resort.controllers;

import case_study_furama_resort.modol.Customer;
import case_study_furama_resort.service.CustomerImpl;
import case_study_furama_resort.service.FuncCustomerFileCSV;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    public static void addNewCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>> How many rooms customers do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Customer> customersList = FuncCustomerFileCSV.readFileCSV();
        for ( int i = 0; i < length; i++){
            Customer customer = CustomerImpl.addNewCustomer();
            customersList.add(customer);
        }
        FuncCustomerFileCSV.writeFileCSV(customersList);
        MainController.processMain();
    }

    public static void showInformationCustomers(){
        ArrayList<Customer> list = FuncCustomerFileCSV.readFileCSV();
        int numericalOrder = 1;
        for(Customer element : list){
            System.out.println(numericalOrder + " " + element.showInfor());
            numericalOrder++;
        }
    }
}
