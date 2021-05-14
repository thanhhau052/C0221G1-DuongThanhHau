//package bai_17_io_binary_file_serialization.bai_tap.bai1;
//
//import com.sun.jdi.request.StepRequest;
//
//import java.util.Scanner;
//
//public class ProcessProduct {
//
//    public Product[] create(){
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap so luong san pham : "); // nhap so luong san pham
//        int num=Integer.parseInt(scanner.nextLine());
//        Product[] products=new Product[num];
//        for (int i = 0 ; i<num ; i++){
//            System.out.println("nhap vao id = ");
//            int id = Integer.parseInt(scanner.nextLine());
//            System.out.println("nhap vao ten cua san pham :");
//            String name=scanner.nextLine();
//            System.out.println("Nhap vao hang san pham  : ");
//            String hang= scanner.nextLine();
//            System.out.println(" Nhap vao gia tien cau san pham : ");
//            int giaTien=Integer.parseInt(scanner.nextLine());
//            System.out.println("Nhap vao mo ta khac cua san pham");
//            String moTa= scanner.nextLine();
//            Product[i]= new Product(id,name,hang,giaTien,moTa);
//
//        }
//        scanner.close();
//        return Product;
//
//
//
//    }
//}
