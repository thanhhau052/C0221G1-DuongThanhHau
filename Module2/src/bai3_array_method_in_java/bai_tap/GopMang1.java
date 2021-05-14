package bai3_array_method_in_java.bai_tap;

import java.util.Scanner;

public class GopMang1 {
    public static int[] nhapMang(int length) {
        int arrNumber[] = new int[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập vào số thứ " + i);
            int phanTuMang = scanner.nextInt();
            arrNumber[i] = phanTuMang;
        }
        return arrNumber;
    }

//    public static void main(String[] args) {
//        System.out.println("Nhap do dai mang1");
//        Scanner doDaiMang = new Scanner(System.in);
//        int[] mang1 = nhapMang(doDaiMang.nextInt());
//        System.out.println("Nhap do dai mang2");
//        int doDaiMang2 = doDaiMang.nextInt();
//        int[] mang2 = nhapMang(doDaiMang2);
//        int[] mang3 = new int[mang1.length + mang2.length];
//    }
}
