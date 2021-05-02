package case_study_furama_resort.service;

import case_study_furama_resort.modol.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FuncCustomerFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    static final String FILE_HEADER_CUSTOMER = "Name,Birthday,Gender,ID Card,Phone Number,Email,Type of Customer,Address,";
    static final String FILE_PATH_CUSTOMER = "src/data/customers.csv";

    public static void writeFileCSV(ArrayList<Customer> list){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(FILE_PATH_CUSTOMER);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(Customer element : list){
                fileWriter.append(element.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getIdCard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getCustomerType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Saved successfully!");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error in CSV File Record");
        } finally {
            try{
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                ex.printStackTrace();
                System.out.println("Error while flushing or closing");
            }
        }
    }

    public static ArrayList<Customer> readFileCSV() {
        BufferedReader br = null;
        ArrayList<Customer> list = new ArrayList<Customer>();
        try {
            br = new BufferedReader(new FileReader(FILE_PATH_CUSTOMER));
            String line = "";
            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(COMMA_DELIMITER);
                if (splitData[0].equals("Name")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setName(splitData[0]);
                customer.setBirthday(splitData[1]);
                customer.setGender(splitData[2]);
                customer.setIdCard(splitData[3]);
                customer.setPhoneNumber(splitData[4]);
                customer.setEmail(splitData[5]);
                customer.setCustomerType(splitData[6]);
                customer.setAddress(splitData[7]);
                list.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }


}
