package case_study_furama_resort.service;

import case_study_furama_resort.modol.House;
import case_study_furama_resort.modol.Room;
import case_study_furama_resort.modol.Villa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FuncWriteServicesFileCSV {
    static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    static final String FILE_HEADER_SERVICE = "ID,Service Name,Area Use,Rental Fee,Max Occ,Type of Rent,";
    static final String FILE_HEADER_VILLA = FILE_HEADER_SERVICE + "Room Standard,Facilities,Swimming Pool,Number of Floor,";
    static final String FILE_HEADER_HOUSE = FILE_HEADER_SERVICE + "Room Standard,Facilities,Number of Floor,";
    static final String FILE_HEADER_ROOM = FILE_HEADER_SERVICE + "Complimentary,";
    static final String FILE_PATH_VILLA = "src/data/villas.csv";
    static final String FILE_PATH_HOUSE = "src/data/houses.csv";
    static final String FILE_PATH_ROOM = "src/data/rooms.csv";

    public static void writeFileCSVVilla(List<Villa> villaList){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(FILE_PATH_VILLA);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(Villa element : villaList){
                fileWriter.append(element.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getAreaUsing()) );
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getrentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getmaxOccupancy()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getTypeRental());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getFacilites());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getAreaSwimmingPool()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getnumberOfFloor()));
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

    public static void writeFileCSVHouse(List<House> houseList){
        FileWriter fileWriter = null;
        try{
//            fileWriter = new FileWriter(FILE_PATH_HOUSE,true);
            fileWriter = new FileWriter(FILE_PATH_HOUSE);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(House element : houseList){
                fileWriter.append(element.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getAreaUsing()) );
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getrentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getmaxOccupancy()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getTypeRental());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getFacilites());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getnumberOfFloor()));
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

    public static void writeFileCSVRoom(List<Room> roomList){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(FILE_PATH_ROOM);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(Room element : roomList){
                fileWriter.append(element.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getAreaUsing()) );
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getrentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getmaxOccupancy()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getTypeRental());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getComplimentary());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Saved successfully!");
        }catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }
}