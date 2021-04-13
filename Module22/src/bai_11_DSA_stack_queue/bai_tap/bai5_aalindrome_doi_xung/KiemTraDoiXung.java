package bai_11_DSA_stack_queue.bai_tap.bai5_aalindrome_doi_xung;

import java.util.LinkedList;
import java.util.Queue;

public class KiemTraDoiXung {
    public static boolean KiemTra(String str) {
        Queue queue = new LinkedList();
        for (int i = str.length() - 1; i >= 0; i--) {
            queue.add(str.charAt(i));
        }
        String newString = "";
        while (!queue.isEmpty()) {
            newString += queue.remove();
        }
        if (str.equals(newString)) {
            return true;
        } else
            return false;


    }
}
