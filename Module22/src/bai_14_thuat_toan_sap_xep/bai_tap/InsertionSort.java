package bai_14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;


public class InsertionSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list = ");
        int size = scanner.nextInt();

        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("list [ " + i + " ] =");
            list[i] = scanner.nextInt();
        }

        System.out.println("after");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int j = i - 1;
            int temp = list[i];
            while (temp < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
        System.out.println("befor");
        for (int list1 : list) {
            System.out.print(list1 + " ");
        }

    }

}
