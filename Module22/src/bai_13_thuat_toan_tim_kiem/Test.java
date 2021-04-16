package bai_13_thuat_toan_tim_kiem;

public class Test {
//    public int  linearSearch(int arr[], int value) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == value)
//                return i;
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        Test test=new Test();
//        int[] ar={1,2,3};
//        System.out.println("index = "+test.linearSearch(ar,2));
//    }

//
//   public int binarySearch (int a[],int low, int high){
//       low = 0;
//       Object list;
//       high = list.lengh-1; mid = (low + high)/2;
//       if ( high >= low)
//           if a[mid] = value return mid;
//       if a[mid] > value
//       return binarySearch(a, low, mid-1, value);
//       if a[mid] < value
//       return binarySearch(a, mid + 1, high, value);
//       kết thúc if
//       return -1
//   }

    int binarySearch(int arr[], int low, int high, int value)
    {
        if (high>=low) {
            int mid = low + (high - low)/2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, low, mid-1, value);
            return binarySearch(arr, mid+1, high, value);
        }
        return -1;
    }





}
