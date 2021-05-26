package quan_li_can_bo.commons;

import quan_li_can_bo.models.CanBo;
import quan_li_can_bo.models.CongNhan;
import quan_li_can_bo.models.KySu;
import quan_li_can_bo.models.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public static final String PATH = "src\\quan_ly_can_bo\\data\\";

    public static void ghiFile(String fileName, List<CanBo> canBoList, boolean trangThai) {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            file = new File(PATH + fileName);
            fileWriter = new FileWriter(file, trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (CanBo canBo : canBoList) {
                bufferedWriter.write(canBo.toString());
                bufferedWriter.newLine();
            }

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

    public static List<CanBo> docFile(String fileName) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<CanBo> canBoList = new ArrayList<>();
        String line = null;
        String[] strings = null;

        try {

            file = new File(PATH + fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileReader = new FileReader(file);

            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() == 0) {
                    continue;
                }
                strings = line.split(",");

                int loai = Integer.parseInt(strings[5]);
                if (loai == 1) {

                    CanBo congNhan = new CongNhan(strings[0], strings[1], strings[2], strings[3], strings[4], strings[6]);
                    canBoList.add(congNhan);
                } else if (loai == 2) {
                    CanBo kySu = new KySu(strings[0], strings[1], strings[2], strings[3], strings[4], strings[6]);
                    canBoList.add(kySu);
                } else {
                    CanBo nhanVien = new NhanVien(strings[0], strings[1], strings[2], strings[3], strings[4], strings[6]);
                    canBoList.add(nhanVien);
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

    public static List<String> docFileNganhDaoTao(String fileName) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> stringList = new ArrayList<>();
        String line = null;
        try {
            file = new File(PATH + fileName);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringList;
    }

}