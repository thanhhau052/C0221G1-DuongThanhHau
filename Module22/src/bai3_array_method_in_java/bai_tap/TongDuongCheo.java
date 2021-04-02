package bai3_array_method_in_java.bai_tap;

public class TongDuongCheo {
    public static void main(String[] args) {
        int[][] mang = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                if (i == j) {
                    sum1 += mang[i][j];
                }
                if (j == mang[i].length - i - 1) {
                    sum2 += mang[i][j];
                }
            }
        }
        int sum3 = sum1 + sum2;
        System.out.println(sum3);
    }
}
