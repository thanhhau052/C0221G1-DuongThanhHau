package bai2_vong_lap.bai_tap;

import java.util.Scanner;

    public class HienThiSoNguyenToNhoHonN {
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
            Scanner scanner= new Scanner(System.in);
            System.out.println("In ra man hinh so nguyen to nho hon? = ");
            int n=scanner.nextInt();
            System.out.println(" So nguyen to nho hon" + n+" la : ");

            int i=2;
            while (i<n){
                if (kiemTraNguyenTo(i)){
                    System.out.println(i+" ");
                }
                i++;
            }

        }
    }
