package bai_tap_lam_them_phuong_tien_giao_thong.commons;

import bai_tap_lam_them_phuong_tien_giao_thong.modol.PhuongTien;
import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeMay;
import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeOTo;
import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilePhuongTien {
    public static final String path = "src\\bai_tap_lam_them_phuong_tien_giao_thong\\data\\";

    public static List<PhuongTien> docFile(String fileName) {
        List<PhuongTien> phuongTienList = new ArrayList<>();
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            file = new File(path + fileName);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            PhuongTien phuongTien = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                if (strings.length == 6) {
                    phuongTien = new XeOTo(strings[0], strings[1], strings[2], strings[3], Integer.parseInt(strings[4]), strings[5]);

                } else if (strings[0].length() == 10) {
                    phuongTien = new XeTai(strings[0], strings[1], strings[2], strings[3], Integer.parseInt(strings[4]));

                } else if (strings[0].length() == 12) {
                    phuongTien = new XeMay(strings[0], strings[1], strings[2], strings[3], Integer.parseInt(strings[4]));
                }
                phuongTienList.add(phuongTien);

            }

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }
        return phuongTienList;
    }

    public static void ghiFile(String fileName, List<PhuongTien> phuongTienList) {
        try {
            File file = new File(path + fileName);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (PhuongTien phuongTien : phuongTienList) {
                bufferedWriter.write(phuongTien.toString());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (Exception e) {
            e.getMessage();
        }

    }

    public static void ghiKhac(String fileName, PhuongTien phuongTien) {
        try {
            File file = new File(path + fileName);
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(phuongTien.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }


}
