package bai_tap_lam_them_phuong_tien_giao_thong.controlles;

import bai_tap_lam_them_phuong_tien_giao_thong.commons.FilePhuongTien;
import bai_tap_lam_them_phuong_tien_giao_thong.modol.PhuongTien;
import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeMay;
import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeOTo;
import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeTai;

import java.util.List;
import java.util.Scanner;

import static bai_tap_lam_them_phuong_tien_giao_thong.commons.NhapDauVao.*;

public class QuanLiPhuongTien {
    private static Scanner scanner = new Scanner(System.in);

    public static void themPhuongTien() {
        int choose;
        do {
            System.out.println("1. O to\n" +
                    "2. Xe tai\n" +
                    "3. Xe may\n" +
                    "4. Thoat ! ");
            System.out.println("Nhap lua chon cua ban : ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    FilePhuongTien.ghiKhac("phuongTien.csv",nhapOTo());
                    break;
                case 2:
                    FilePhuongTien.ghiKhac("phuongTien.csv",nhapXeTai());
                    break;
                case 3:
                    FilePhuongTien.ghiKhac("phuongTien.csv",nhapXeMay());
                    break;
                case 4:
                    System.out.println("exit!");
                    return;
                default:
                    System.out.println("nhap lai");
            }

        } while (true);


    }


    public static void hienThiPhuongTien() {
        do {
            try {
                System.out.println("1. Hiện thị xe o to.\n" +
                        "2. Hiện thị xe tai . \n" +
                        "3. Hiện  xe máy.\n" +
                        "4. Thoat");
                System.out.println("Nhap vao lua chon");
                int choose = Integer.parseInt(scanner.nextLine());
                List<PhuongTien> phuongTienList = FilePhuongTien.docFile("phuongTien.csv");
                switch (choose) {
                    case 1:
                        for (PhuongTien phuongTien : phuongTienList )
                        {
                            System.out.println(phuongTien.showInfor());
                            if (phuongTien instanceof XeTai) {
                                System.out.println(phuongTien.showInfor());
                            }
                        }
                        break;
                    case 2:
                        for (PhuongTien phuongTien : phuongTienList
                        ) {
                            if (phuongTien instanceof XeOTo) {
                                System.out.println(phuongTien.showInfor());
                            }
                        }
                        break;
                    case 3:
                        for (PhuongTien phuongTien : phuongTienList
                        ) {
                            if (phuongTien instanceof XeMay) {
                                System.out.println(phuongTien.showInfor());
                            }
                        }
                        break;
                    case 4:
                        return;
                }

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);


    }

    public static void xoaPhuongTien() {
        System.out.println("Nhap vao bien kiem soat can xoa :  ");
        String xoaBienKiemSoat = scanner.nextLine();
        List<PhuongTien> phuongTienList = FilePhuongTien.docFile("phuongTien.csv");
        for (PhuongTien phuongTien : phuongTienList) {
            if (phuongTien.getBienKiemSoat().equals(xoaBienKiemSoat)) {
                System.out.println("1. Yes \n" +
                        "2.No");
                int chon = Integer.parseInt(scanner.nextLine());
                switch (chon) {
                    case 1:
                        phuongTienList.remove(phuongTien);
                        System.out.println("Da xoa thanh cong ! ");
                        break;
                    case 2:
                        break;

                }
            }
            FilePhuongTien.ghiFile("phuongTien.csv",phuongTienList);

        }
    }

}
