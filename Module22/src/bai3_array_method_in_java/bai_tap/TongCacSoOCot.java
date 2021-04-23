package bai3_array_method_in_java.bai_tap;

import java.util.Scanner;

public class TongCacSoOCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] +"\n");
            }
        }

        System.out.print("ban muon tinh tong o cot =");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (n==j){
                        sum+=arr[i][n];
                    }

                }
        }
        System.out.println(sum);
//        System.err.println("loi o day");
    }
}
