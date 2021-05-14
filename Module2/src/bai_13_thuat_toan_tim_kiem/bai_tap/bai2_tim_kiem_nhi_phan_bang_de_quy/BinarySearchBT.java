package bai_13_thuat_toan_tim_kiem.bai_tap.bai2_tim_kiem_nhi_phan_bang_de_quy;

class BinarySearchBT {
    int binarySearch(int array[], int x, int low, int high) {

        if (high >= low) {

            int mid = low + (high - low) / 2;

            if (array[mid] == x) {

                return mid;

            } else if (array[mid] > x) {

                return binarySearch(array, x, low, mid - 1);
            } else {

                return binarySearch(array, x, mid + 1, high);

            }
        }
        return -1;
    }

}
