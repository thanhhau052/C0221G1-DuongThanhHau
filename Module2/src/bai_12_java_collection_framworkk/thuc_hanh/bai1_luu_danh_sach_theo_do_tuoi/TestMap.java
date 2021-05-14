package bai_12_java_collection_framworkk.thuc_hanh.bai1_luu_danh_sach_theo_do_tuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hasMap = new HashMap<>();
        hasMap.put("Khánh",15);
        hasMap.put("Cương",22);
        hasMap.put("Hà",13);
        hasMap.put("Nam",21);
        System.out.println("Hiển thị danh sách HashMap: ");
        System.out.println(hasMap+"\n"  );

        Map<String , Integer > treeMap= new TreeMap<>(hasMap);
        System.out.println("Danh sách được sắp xếp theo thứ tự  giảm  dần là :" );
        System.out.println(treeMap);
        Map<String ,Integer >linkedHashMap = new LinkedHashMap<>(16,0.5f);
        linkedHashMap.put("Khánh",15);
        linkedHashMap.put("Cương",22);
        linkedHashMap.put("Hà",13);
        linkedHashMap.put("Nam",21);
        System.out.println("\n Tuổi của "+"Nam :"+linkedHashMap.get("Nam"));
    }

}
