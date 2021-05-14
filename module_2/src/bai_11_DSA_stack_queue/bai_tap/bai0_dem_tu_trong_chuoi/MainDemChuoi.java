package bai_11_DSA_stack_queue.bai_tap.bai0_dem_tu_trong_chuoi;

import java.util.Scanner;

import static bai_11_DSA_stack_queue.bai_tap.bai0_dem_tu_trong_chuoi.DemChuoi.demKyTu;

public class MainDemChuoi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bạn cần kiểm tra  : ");
        String chuoi=scanner.nextLine();
//        String chuoi2=scanner.nextLine();
//        String chuoi3=scanner.nextLine();
            demKyTu(chuoi);

//            demKyTu(chuoi2);
//            demKyTu(chuoi3);


    }
}
