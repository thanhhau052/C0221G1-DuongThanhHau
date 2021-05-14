package bai4_oop_in_java.bai_tap.PTB2OOP;

import bai4_oop_in_java.bai_tap.PhuongTrinhBacHai;

import java.util.Scanner;


public class PTB2Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhập vào hệ số  b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập vào  hằng số  c = ");
        float c = scanner.nextFloat();
        PTB2modol ptb2modol = new PTB2modol(a, b, c);
        PTB2Action ptb2Action = new PTB2Action();
        ptb2Action.giaiPTBac2(ptb2modol);
    }

}
