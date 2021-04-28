package bai_tap_lam_them_phuong_tien_giao_thong.controlles;

import java.util.Scanner;

import static bai_tap_lam_them_phuong_tien_giao_thong.modol.XeMay.nhapXeMay;
import static bai_tap_lam_them_phuong_tien_giao_thong.modol.XeOTo.nhapOTo;
import static bai_tap_lam_them_phuong_tien_giao_thong.modol.XeTai.nhapXeTai;

public class MainContrlles {
   private static Scanner scanner = new Scanner(System.in);
    public static void themPhuongTien() {
        int choose;
        do {
        System.out.println("1. O to\n" +
                "2. Xe tai\n" +
                "3. Xe may\n" +
                "4. Thoat ! ");
        System.out.println("Nhap lua chon cua ban : ");
         choose =Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    nhapOTo();
                    break;
                case 2:
                    nhapXeTai();
                    break;
                case 3:
                    nhapXeMay();
                    break;
                case 4:
                    System.out.println("exit!");
                    break;
                default:
                    System.out.println("nhap lai");
            }
            if(choose==4){
                break;
            }
        }while (true);


    }






    public static void hienThiPhuongTien() {


    }

    public static void xoaPhuongTien() {
    }


}
