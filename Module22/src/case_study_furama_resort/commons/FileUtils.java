package case_study_furama_resort.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;
    private static String path;

    public static void writeFile(String[] content) {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(StringUtils.concat(content, StringUtils.COMA));
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile() {
        List<String> arrayContent = new ArrayList<String>();
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                arrayContent.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayContent;
    }

    public static void setFullPathFile(String fileName) {
        StringBuffer path = new StringBuffer("D:\\Work\\CodeGym\\FuramaResort\\src\\data");
        path.append(fileName);
        path.append(StringUtils.CSV);

        FileUtils.path = path.toString();
    }
}