package case_study_furama_resort.service;

import case_study_furama_resort.modol.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FuncBookingFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_BOOKING = FuncCustomerFileCSV.FILE_HEADER_CUSTOMER + FuncWriteServicesFileCSV.FILE_HEADER_SERVICE;
    static final String FILE_PATH_BOOKING = "src/data/bookings.csv";

    public static void writeFileCSV(ArrayList<Customer> bookingList) {
        FileWriter fileWriter = null;

        try {
//          fileWriter = new FileWriter(FILE_PATH_BOOKING, true);
            fileWriter = new FileWriter(FILE_PATH_BOOKING);
            fileWriter.append(FILE_HEADER_BOOKING);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer element : bookingList) {
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
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getService().getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getService().getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getService().getAreaUsing()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getService().getrentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getService().getmaxOccupancy()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getService().getTypeRental());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Saved successfully!");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error in CSV File Record");
        } finally{
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Error while flushing or closing");
            }
        }
    }

    public static ArrayList<Customer> readFileCSV() {
        BufferedReader br = null;
        String line = "";
        ArrayList<Customer> list = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(FILE_PATH_BOOKING));

            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(COMMA_DELIMITER);
                if (splitData[0].equals("Name")) {
                    continue;
                }
                Customer customer = new Customer(splitData[0],splitData[1],splitData[2],splitData[3],splitData[4],splitData[5],splitData[6],splitData[7],splitData[8],splitData[9],splitData[10],splitData[11],splitData[12],splitData[13]);
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