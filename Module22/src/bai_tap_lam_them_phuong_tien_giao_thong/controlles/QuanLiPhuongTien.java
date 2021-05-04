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

    public static void showMenu() {

        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");

            System.out.println("chọn chức năng : \n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n");
            int choose;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào lựa chọn của bạn : ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    themPhuongTien();
                    break;
                case 2:
                    hienThiPhuongTien();
                    break;
                case 3:
                    xoaPhuongTien();
                    break;
                case 4:
                    System.out.println("Thoat ! ");
                    break;
                default:
                    System.out.println("nhap lai lua chon cua ban ! ");
                    break;

            }
            if (choose == 4) {
                break;
            }

        } while (true);
    }

    public static void themPhuongTien() {
        int choose;
        do {
            System.out.println("1. Ô tô \n" +
                    "2. Xe tải \n" +
                    "3. Xe máy\n" +
                    "4. Thoát  ! ");
            System.out.println("Nhập vào sự lựa chọn của bạn :  ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    FilePhuongTien.ghiKhac("phuongTien.csv", nhapOTo());
                    break;
                case 2:
                    FilePhuongTien.ghiKhac("phuongTien.csv", nhapXeTai());
                    break;
                case 3:
                    FilePhuongTien.ghiKhac("phuongTien.csv", nhapXeMay());
                    break;
                case 4:
                    System.out.println("Thoát ! Tạm biệt ");
                    return;
                default:
                    System.err.println("Bạn nhập sai rồi \n" +
                            "Vui lòng nhập lại : ");
            }

        } while (true);


    }


    public static void hienThiPhuongTien() {
        do {
            try {
                System.out.println("1. Hiển thị xe Ô tô \n" +
                        "2. Hiển thị xe tải . \n" +
                        "3. Hiển  xe máy.\n" +
                        "4. Thoát ! Tạm biệt ! ");
                System.out.println("Nhập vào sự lựa chọn của bạn ! ");
                int choose = Integer.parseInt(scanner.nextLine());
                List<PhuongTien> phuongTienList = FilePhuongTien.docFile("phuongTien.csv");
                switch (choose) {
                    case 1:
                        for (PhuongTien phuongTien : phuongTienList) {
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
        System.out.println("Nhập vào biển kiểm soát cần xóa  :  ");
        String xoaBienKiemSoat = scanner.nextLine();
        List<PhuongTien> phuongTienList = FilePhuongTien.docFile("phuongTien.csv");
        for (PhuongTien phuongTien : phuongTienList) {
            if (phuongTien.getBienKiemSoat().equals(xoaBienKiemSoat)) {
                System.out.println("1. Yes ! \n" +
                        "2.No");
                int chon = Integer.parseInt(scanner.nextLine());
                switch (chon) {
                    case 1:
                        phuongTienList.remove(phuongTien);
                        System.out.println("Đã xóa thành công ! ");
                        break;
                    case 2:
                        break;

                }
            }
            FilePhuongTien.ghiFile("phuongTien.csv", phuongTienList);

        }
    }


}
