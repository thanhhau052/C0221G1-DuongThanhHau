package bai2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao : ");
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.println(num + " Khong phai la so nguyen to ! ");

        } else {
            boolean check = true;
            byte i;
            for (i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }

            }
            if (check) {
                System.out.println(num + ": la so nguyen to ! ");
            } else {
                System.out.println(num + ": khong phai la so nguyen to ! ");
            }
        }

    }
}
