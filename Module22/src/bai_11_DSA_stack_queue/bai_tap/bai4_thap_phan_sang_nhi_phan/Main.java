package bai_11_DSA_stack_queue.bai_tap.bai4_thap_phan_sang_nhi_phan;

import bai_11_DSA_stack_queue.bai_tap.bai1_dao_nguoc_chuoi_stack.MainDaoChuoi;

import java.util.Scanner;

import static bai_11_DSA_stack_queue.bai_tap.bai4_thap_phan_sang_nhi_phan.chuyen_thap_phan_sang_nhi_phan.thapPhanSangNhiPhan;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so ban can kiem tra : ");
        int num = scanner.nextInt();
        String ketQua = thapPhanSangNhiPhan(num);
        StringBuffer ketQuaHienThi = new StringBuffer(ketQua);
        MainDaoChuoi.reverse(ketQuaHienThi);
        System.out.println(ketQuaHienThi);

    }

}
