package QuanLiPhuongTien.controlles;

import java.util.Scanner;

public class QuanLiPhuongTien {
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        do {
            try {
                System.out.println("Chọn chức năng:\n" +
                        "1. Thêm mới phương tiện.\n" +
                        "2. Hiện thị phương tiện\n" +
                        "3. Xóa phương tiện\n" +
                        "4. Thoát\n");
                int chon;
                System.out.println("Nhập vào lựa chọn của bạn : ");
                chon = Integer.parseInt(scanner.nextLine());
                switch (chon) {
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
                        System.out.println("Tạm biệt ! ");
                        return;
                    default:
                        System.out.println("Vui lòng nhập lại lựa chọn của bạn : ");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());

            }
        } while (true);


    }

    private static void themPhuongTien() {
        do {
            try {
                int chon;
                System.out.println("" +"Nhập vào sự lựa chọn của bạn : \n"+
                        "1. Thêm xe tải,\n" +
                        " \t2. Thêm ôtô, \n" +
                        "3. Thêm  xe máy\n"+
                        "4. Thoát ");
//                switch (chon){
//                    case 1:
//
//                        break;
//                    case 2:
//
//                        break;
//                    case 3:
//
//                        break;
//                    case 4:
//                    System.out.println("Thoát ! Tạm biệt ");
//                        return;
//                    default:
//                        System.err.println("Bạn nhập sai rồi ! Vui lòng nhập lại  ! ");
//
//                }
            }catch (Exception e){
                System.err.println("Err"+e.getMessage() );

            }
        }while (true);


    }


    private static void hienThiPhuongTien() {
    }

    private static void xoaPhuongTien() {
    }

}
