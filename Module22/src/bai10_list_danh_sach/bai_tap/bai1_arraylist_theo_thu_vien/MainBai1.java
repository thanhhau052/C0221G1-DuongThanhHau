package bai10_list_danh_sach.bai_tap.bai1_arraylist_theo_thu_vien;


public class MainBai1 {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        print(list.getData());
        System.out.println(list.indexOf("không"));
        System.out.println(list.indexOf("có"));
        list.remove(1);
        list.add("a",1);
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("a"));
        System.out.println(clone.contains("a"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    public static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}