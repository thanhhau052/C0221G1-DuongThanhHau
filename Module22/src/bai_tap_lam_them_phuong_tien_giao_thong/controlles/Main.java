package bai_tap_lam_them_phuong_tien_giao_thong.controlles;

import java.util.Scanner;

import static bai_tap_lam_them_phuong_tien_giao_thong.controlles.MainContrlles.*;

public class Main {
    public static void main(String[] args) {
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


}
