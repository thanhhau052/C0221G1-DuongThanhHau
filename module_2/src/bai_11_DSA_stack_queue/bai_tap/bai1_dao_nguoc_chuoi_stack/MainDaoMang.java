package bai_11_DSA_stack_queue.bai_tap.bai1_dao_nguoc_chuoi_stack;

import java.util.Arrays;

public class MainDaoMang {

    public static void reverse(StringBuffer str) {
        int n = str.length();
        WStack object = new WStack(n);
        int i;
        for (i = 0; i < n; i++) {
            object.push(str.charAt(i));
        }

        for (i = 0; i < n; i++) {
            char ch = object.pop();
            str.setCharAt(i, ch);
        }
    }

    public static void main(String args[]) {

        int[] mang = {1, 2, 3, 4, 5, 6};
        String mangIn = Arrays.toString(mang);
        String chuoi = "";
        for (int str : mang)
            chuoi += str;
        StringBuffer chuoiDaoNguoc = new StringBuffer(chuoi);

        reverse(chuoiDaoNguoc);
//        char[] arr=ch.toCharArray();
        System.out.println(mangIn + " đảo ngược là : " + chuoiDaoNguoc);
    }
}
