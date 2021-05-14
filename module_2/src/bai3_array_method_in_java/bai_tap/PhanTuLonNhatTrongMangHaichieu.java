package bai3_array_method_in_java.bai_tap;

import java.util.Scanner;

public class PhanTuLonNhatTrongMangHaichieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        int m;
        int n;
        System.out.print("Nhap vao kich thuoc mang lon :");
        m = scanner.nextInt();
        System.out.print("Nhap vao kih thuoc cua mang nho :");
        n = scanner.nextInt();
        int arr[][] = new int[m][n];
        int max= arr[0][0];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }


        }
        System.out.println("Gia tri lon nhat trong ma tran "+m+"x"+n+"la : "+max);
    }
}
