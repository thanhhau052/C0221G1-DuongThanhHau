package bai_17_io_binary_file_serialization.bai_tap.bai1_quan_li_san_phamm;

import java.io.*;
import java.util.ArrayList;

public class ProductFile {

    public static void readProduct (String path) throws Exception {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Product> products = (ArrayList<Product>) objectInputStream.readObject();
            System.out.println(products);
            System.out.println("Successful Reading !"); // doc file thanh cong !
        } catch (FileNotFoundException e) {
            e.getMessage();
        } finally {
            objectInputStream.close();
            fileInputStream.close();
        }
    }

    public static void writeProduct (ArrayList<Product> arrayList, String path) throws IOException {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayList);
            System.out.println("Successful Writing !"); // ghi file thanh cong!
        } catch (FileNotFoundException e) {
            e.getMessage();
        } finally {
            objectOutputStream.close();
            fileOutputStream.close();
        }
    }


}