package bai_14_thuat_toan_sap_xep.thuc_hanh.bai2_thuat_toan_sap_xep_chon;

import java.util.Arrays;

public class SelectionSor {
    static double[] lists = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(lists);
//        for (int i = 0; i < lists.length; i++){
//            System.out.print(lists[i] + " ");
//        }
        System.out.println(Arrays.toString(lists));

    }


}
