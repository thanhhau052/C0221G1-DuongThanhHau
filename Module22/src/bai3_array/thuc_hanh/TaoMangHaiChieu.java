package bai3_array.thuc_hanh;


import java.util.Arrays;
import java.util.Scanner;

public class TaoMangHaiChieu {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8};
        int i;
        for ( i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {

                continue;

            }
            System.out.print(i);
        }
    }
}
