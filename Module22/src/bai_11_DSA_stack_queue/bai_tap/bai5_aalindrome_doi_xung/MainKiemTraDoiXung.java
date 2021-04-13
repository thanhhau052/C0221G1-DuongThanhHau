package bai_11_DSA_stack_queue.bai_tap.bai5_aalindrome_doi_xung;

import java.util.Scanner;

public class MainKiemTraDoiXung {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap vao chuoi ban can kiem tra : ");
        String str= scanner.nextLine();
        if (KiemTraDoiXung.KiemTra(str)){
            System.out.println("doi xung");

        }else {
            System.out.println("ko doi xung");
        }
    }
}
