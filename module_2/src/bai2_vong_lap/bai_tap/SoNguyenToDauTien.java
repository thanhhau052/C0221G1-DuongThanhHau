package bai2_vong_lap.bai_tap;

import java.util.Scanner;

public class SoNguyenToDauTien {
    public static boolean kiemTraNguyenTo(double num) {
        boolean check = true;
        if (num < 2) {
            check = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                check = false;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao so  luong so nguyen to dau tien can in ra : ");
        int n = scanner.nextInt();
        System.out.println(n + " so nguyen to dau tien la : ");
        int count = 0;
        int i = 2;
        while (count < n) {
            if (kiemTraNguyenTo(i)) {
                System.out.println(i + " ");
                count++;
            }
            i++;
        }
    }
}
