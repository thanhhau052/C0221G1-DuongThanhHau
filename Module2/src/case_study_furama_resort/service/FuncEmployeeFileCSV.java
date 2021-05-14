package case_study_furama_resort.service;

import case_study_furama_resort.modol.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FuncEmployeeFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_EMPLOYEE = "ID,Name,Birthday,ID Card,Phone Number,Email,Education Level,Position,Salary,";
    static final String FILE_PATH_EMPLOYEE = "src/data/employee.csv";

    public static void writeFileCSV(List<Employee> list){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(FILE_PATH_EMPLOYEE);
            fileWriter.append(FILE_HEADER_EMPLOYEE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(Employee element : list){
                fileWriter.append(element.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getIdCard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getEducationLevel());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getPosition());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getSalary()));
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

    public static List<Employee> readFileCSV() {
        BufferedReader br = null;
        List<Employee> list = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(FILE_PATH_EMPLOYEE));
            String line = "";
            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(COMMA_DELIMITER);
                if (splitData[0].equals("ID")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setId(splitData[0]);
                employee.setName(splitData[1]);
                employee.setBirthday(splitData[2]);
                employee.setIdCard(splitData[3]);
                employee.setPhoneNumber(splitData[4]);
                employee.setEmail(splitData[5]);
                employee.setEducationLevel(splitData[6]);
                employee.setPosition(splitData[7]);
                employee.setSalary(Double.parseDouble(splitData[8]));
                list.add(employee);
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