package bai_13_thuat_toan_tim_kiem.thuc_hanh.bai1_tim_kiem_nhi_phan;

import static bai_13_thuat_toan_tim_kiem.thuc_hanh.bai1_tim_kiem_nhi_phan.BinarySearchTH.binarySearch;
import static bai_13_thuat_toan_tim_kiem.thuc_hanh.bai1_tim_kiem_nhi_phan.BinarySearchTH.list;

public class Main {

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}
