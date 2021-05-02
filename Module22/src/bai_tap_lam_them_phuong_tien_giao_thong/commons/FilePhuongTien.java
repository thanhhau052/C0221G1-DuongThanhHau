package bai_tap_lam_them_phuong_tien_giao_thong.commons;

import java.io.*;

public class FilePhuongTien {
    public static void docFile(String path) throws IOException {
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                System.out.println(strings);

            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void ghiFile(String path) {
        try {
            File file= new File(path);
             FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             fileWriter.close();
             bufferedWriter.close();

        }catch (Exception e){
            e.getMessage();
        }

    }


}
