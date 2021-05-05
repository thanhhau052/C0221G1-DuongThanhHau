package bai_tap_lam_them_phuong_tien_giao_thong.commons;

import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeMay;
import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeOTo;
import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeTai;

import java.util.Scanner;

public class NhapDauVao {
    static Scanner scanner = new Scanner(System.in);

    public static XeTai nhapXeTai() {
        do {
            try {
                String bienKiemSoat = Validate.biemKiemSoatXeTai();
                System.out.println("Vui lòng nhập vào hãng sản xuất  : ");
                String hangSanXuat = scanner.nextLine();
                System.out.println("Vui lòng nhập vào năm sản xuất  : ");
                String namSanXuat = scanner.nextLine();
                System.out.println("Vui lòng nhập vào chủ sở hữu: ");
                String chuSoHuu = scanner.nextLine();
                System.out.println(" Vui lòng nhập vào trọng tải : ");
                int trongTai = Integer.parseInt(scanner.nextLine());
                return new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);


    }

    public static XeMay nhapXeMay() {
        do {
            try {
                String bienKiemSoat = Validate.biemKiemSoatXeMay();
                System.out.println("Nhập vào hãng sản xuất : ");
                String hangSanXuat = scanner.nextLine();
                System.out.println("Nhập vào nắm sản xuất : ");
                String namSanXuat = scanner.nextLine();
                System.out.println("Nhập vào chủ sở hữu : ");
                String chuSoHuu = scanner.nextLine();
                System.out.println(" Nhập vào công suất của phương tiện  : ");
                int congSuat = Integer.parseInt(scanner.nextLine());
                return new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
            } catch (Exception e) {
                System.err.println(e.getMessage());

            }
        } while (true);


    }


    public static XeOTo nhapOTo() {
        do {
            try {
                String bienKiemSoat =Validate.biemKiemSoatOto();
                System.out.println("Nhập vào hãng sản xuất  : ");
                String hangSanXuat = scanner.nextLine();
                System.out.println("Nhập vào năm sản xuất : ");
                String namSanXuat = scanner.nextLine();
                System.out.println(" Nhập vào chủ sở hữu: ");
                String chuSoHuu = scanner.nextLine();
                System.out.println(" Nhập vào số lượng chỗ ngồi của phương tiện : ");
                int soCho = Integer.parseInt(scanner.nextLine());
                String kieuXe;
               if (bienKiemSoat.contains("A")){
                   kieuXe="Du Lịch";

               }
               else {
                   kieuXe="Xe Khách";
               }
                return new XeOTo(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soCho, kieuXe);
            } catch (Exception e) {
                System.err.println(e.getCause());

            }
        } while (true);


    }
}
