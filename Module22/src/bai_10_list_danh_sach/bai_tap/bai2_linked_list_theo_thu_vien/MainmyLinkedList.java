package bai_10_list_danh_sach.bai_tap.bai2_linked_list_theo_thu_vien;

public class MainmyLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(3, 4);
        list.add(4, 5);
        list.addFirst(0);
        System.out.println(list.indexOf("Melinda"));
        list.printList();
    }
}
