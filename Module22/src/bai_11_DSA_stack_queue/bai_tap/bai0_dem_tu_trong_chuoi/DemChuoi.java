package bai_11_DSA_stack_queue.bai_tap.bai0_dem_tu_trong_chuoi;

import java.util.HashMap;

public class DemChuoi {

    public static void demKyTu(String input) {

        HashMap<Character, Integer> kiTu = new HashMap<Character, Integer>();


        char[] charArray = input.toCharArray();


        for (char c : charArray) {
            if (kiTu.containsKey(c)) {

                kiTu.put(c, kiTu.get(c) + 1);
            } else {

                kiTu.put(c, 1);
            }
        }


        System.out.println(kiTu+"\n");
    }
}
