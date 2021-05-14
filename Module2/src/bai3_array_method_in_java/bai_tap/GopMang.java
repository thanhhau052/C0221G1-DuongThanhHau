package bai3_array_method_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr = new int[10];
        int i;
        for (i = 0; i < arr1.length; i++) {
            System.out.print("arr1[" + i + "]=");
            arr1[i] = scanner.nextInt();
        }
        for (i = 0; i < arr2.length; i++) {
            System.out.print("arr2[" + i + "]=");
            arr2[i] = scanner.nextInt();
        }
        for (i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}
