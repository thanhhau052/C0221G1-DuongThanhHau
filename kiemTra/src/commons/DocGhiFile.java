package commons;

import models.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public static final String PATH = "src/data\\";

    public static void ghiFile(String fileName, List<DanhBa> danhBaList, boolean trangThai) {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            file = new File(PATH + fileName);
            fileWriter = new FileWriter(file, trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (DanhBa danhBa : danhBaList) {
                bufferedWriter.write(danhBa.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<DanhBa> docFile(String fileName) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<DanhBa> canBoList = new ArrayList<>();
        String line = null;


        try {

            file = new File(PATH + fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileReader = new FileReader(file);

            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                if(line.length() == 0){
                    continue;
                }
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return canBoList;
    }

}