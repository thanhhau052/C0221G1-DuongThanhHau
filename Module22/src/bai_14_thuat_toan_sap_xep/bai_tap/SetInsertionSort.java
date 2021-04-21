package bai_14_thuat_toan_sap_xep.bai_tap;

public class SetInsertionSort {
    static double[] list = {1,9,-9,6,-3,5,7};
    public static void insertionSort(double[] list) {
        for (int i = 1; i < list.length ; i++) {
            double currentElement = list[i];
            int j = i;

            for (j = i - 1; j >= 0 && list[j]>currentElement ; j--) {
                list[j+1] = list[j];
            }

            list[j+1] = currentElement;
        }
    }
    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}