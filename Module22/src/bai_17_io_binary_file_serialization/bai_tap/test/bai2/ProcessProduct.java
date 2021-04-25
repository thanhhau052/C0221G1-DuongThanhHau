package bai_17_io_binary_file_serialization.bai_tap.bai2;

import java.io.*;
import java.util.Scanner;

public class ProcessProduct {

    public IO_Product.Product[] create() {      // Input the data from Keyboard

        Scanner scan = new Scanner(System.in);

        System.out.print("Nhap vao so luong san pham  : ");
        int n = Integer.parseInt(scan.nextLine());

        IO_Product.Product[] Product = new IO_Product.Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao id san pham : ");
            int id = Integer.parseInt(scan.nextLine());
            System.out.println("Nhap vao ten san pham : ");
            String name = scan.nextLine();
            System.out.println("Nhap vao hang cua san pham : ");
            String brand = scan.nextLine();
            System.out.println("Nhap vao gia san pham");
            double money = Double.parseDouble(scan.nextLine());
            System.out.println("Nhap mo ta khac cho san pham : ");
            String desc = scan.nextLine();
            Product[i] = new IO_Product.Product(id, name, brand, money, desc);    // khoi tao doi tuong Product thu i
        }

        scan.close();
        return Product;
    }

    public void write(IO_Product.Product[] product) {  //ghi theo Object
        FileOutputStream f = null;
        ObjectOutputStream oStream = null;
        try {   // dat try cacth de tranh ngoai le khi tao va ghi File
            f = new FileOutputStream("Product.txt");   // tao file f tro den Product.dat
            oStream = new ObjectOutputStream(f); // dung de ghi theo Object vao file f
            oStream.writeObject(product);   // ghi Product theo kieu Object vao file
        } catch (IOException e) {
            System.out.println("Error Write file");
        } finally {
            try {
                oStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public IO_Product.Product[] read() {       // doc theo Object
        IO_Product.Product[] Product = null;
        ObjectInputStream inStream = null;
        FileInputStream f = null;
        try {   // dat try cacth de tranh ngoai le khi tao va doc File
            f = new FileInputStream("Product.txt"); // tao file f tro den Product.dat
            inStream = new ObjectInputStream(f);  // dung de doc theo Object vao file f
            // dung inStream doc theo Object, ep kieu tra ve la Product
            Product = (IO_Product.Product[]) inStream.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        } finally {
            try {
                inStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Product;
    }

    public void show(IO_Product.Product[] product) throws Exception {      //In data doc duoc tu file ra man hinh
        try {
            for (int i = 0; i < product.length; i++) {
                System.out.println((i + 1) + " :\n" +
                        "Product id is: " + product[i].getId() +
                        "\n Product name is: " + product[i].getName() +
                        "\n Product brand is: " + product[i].getHangSanPham() +
                        "\n Product money is:" + product[i].getGiaTien() +
                        "\n Product desc is:" + product[i].getMoTa());
            }
        } catch (NullPointerException e) {
            System.out.println("File Empty");
        }
    }
}