package case_study_furama_resort.service;

import case_study_furama_resort.modol.Customer;

import java.util.Scanner;

public class CustomerImpl {
    public static Customer addNewCustomer(){
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.println("Customer Name: ");
        customer.setName(input.nextLine());

        System.out.println("Birthday: ");
        customer.setBirthday(input.nextLine());

        System.out.println("Gender: ");
        customer.setGender(input.nextLine());

        System.out.println("ID Card: ");
        customer.setIdCard(input.nextLine());

        System.out.println("Phone Number: ");
        customer.setPhoneNumber(input.nextLine());

        System.out.println("Email: ");
        customer.setEmail(input.nextLine());

        System.out.println("Type of Customer: ");
        customer.setCustomerType(input.nextLine());

        System.out.println("Address: ");
        customer.setAddress(input.nextLine());
        return customer;
    }
}