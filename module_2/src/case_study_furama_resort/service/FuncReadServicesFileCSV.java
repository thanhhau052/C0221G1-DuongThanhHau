package case_study_furama_resort.service;

import case_study_furama_resort.modol.House;
import case_study_furama_resort.modol.Room;
import case_study_furama_resort.modol.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FuncReadServicesFileCSV {
    public static List<Villa> readFileCSVVilla() {
        BufferedReader br = null;
        List<Villa> list = new ArrayList<>();
        String line = "";
        try {
            br = new BufferedReader(new FileReader(FuncWriteServicesFileCSV.FILE_PATH_VILLA));
            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(FuncWriteServicesFileCSV.COMMA_DELIMITER);
                if (splitData[0].equals("ID")) {
                    continue;
                }
                Villa svc = new Villa();
                svc.setId(splitData[0]);
                svc.setServiceName(splitData[1]);
                svc.setAreaUsing(Float.parseFloat(splitData[2]));
                svc.setrentalFee(Double.parseDouble(splitData[3]));
                svc.setmaxOccupancy(Integer.parseInt(splitData[4]));
                svc.setTypeRental(splitData[5]);
                svc.setRoomStandard(splitData[6]);
                svc.setFacilites(splitData[7]);
                svc.setAreaSwimmingPool(Float.parseFloat(splitData[8]));
                svc.setnumberOfFloor(Integer.parseInt(splitData[9]));
                list.add(svc);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("meo");
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("meomeo");
            }
        }
        return list;
    }

    public static List<House> readFileCSVHouse() {
        BufferedReader br = null;
        List<House> list = new ArrayList<House>();
        try {
            br = new BufferedReader(new FileReader(FuncWriteServicesFileCSV.FILE_PATH_HOUSE));
            String line = "";
            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(FuncWriteServicesFileCSV.COMMA_DELIMITER);
                if (splitData[0].equals("ID")) {
                    continue;
                }
                House svc = new House();
                svc.setId(splitData[0]);
                svc.setServiceName(splitData[1]);
                svc.setAreaUsing(Float.parseFloat(splitData[2]));
                svc.setrentalFee(Double.parseDouble(splitData[3]));
                svc.setmaxOccupancy(Integer.parseInt(splitData[4]));
                svc.setTypeRental(splitData[5]);
                svc.setRoomStandard(splitData[6]);
                svc.setFacilites(splitData[7]);
                svc.setnumberOfFloor(Integer.parseInt(splitData[8]));
                list.add(svc);
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

    public static List<Room> readFileCSVRoom() {
        BufferedReader br = null;
        List<Room> list = new ArrayList<Room>();
        try {
            br = new BufferedReader(new FileReader(FuncWriteServicesFileCSV.FILE_PATH_ROOM));
            String line = "";
            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(FuncWriteServicesFileCSV.COMMA_DELIMITER);
                if (splitData[0].equals("ID")) {
                    continue;
                }
                Room svc = new Room();
                svc.setId(splitData[0]);
                svc.setServiceName(splitData[1]);
                svc.setAreaUsing(Float.parseFloat(splitData[2]));
                svc.setrentalFee(Double.parseDouble(splitData[3]));
                svc.setmaxOccupancy(Integer.parseInt(splitData[4]));
                svc.setTypeRental(splitData[5]);
                svc.setComplimentary(splitData[6]);
                list.add(svc);
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

    public static TreeSet<String> getAllNameServiceFromFileCSV(String path) {
        BufferedReader br = null;
        TreeSet<String> list = new TreeSet<>();
        try {
            br = new BufferedReader(new FileReader(path));
            String line = "";
            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(FuncWriteServicesFileCSV.COMMA_DELIMITER);
                if (splitData[0].equals("ID")) {
                    continue;
                }
                list.add(splitData[1]);
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
