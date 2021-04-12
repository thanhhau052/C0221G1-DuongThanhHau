package bai10_list_danh_sach.bai_tap.bai1_arraylist_theo_thu_vien;

import java.util.Arrays;

public class MyList<elements> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private elements[] data;

    public MyList() {
        data = (elements[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        data = (elements[]) new Object[size];
    }

    private void ensureCapa() {
        if (size > data.length) {
            int newSize = size * 2 ;
            data = Arrays.copyOf(data, newSize);
        }
    }

    public void add(elements e) {
        size += 1;
        ensureCapa();
        data[size - 1] = e;
    }

    public boolean add(elements e, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = e;
            return true;
        }
        return false;
    }
    public elements get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        }
        return null;
        /*  crt+shift +/*/
    }

//    @Override
//    public MyList clone() {
//        MyList<elements> clone = new MyList<>(data.length);
//        for (elements x : data) {
//            clone.add(x);
//        }
//        return clone;
//    }
    @Override
    public MyList clone(){
        MyList<elements> clone = new MyList<>(data.length);
        for (elements x : data){
            clone.add(x);
        }
        return  clone;
    }

    public elements[] getData() {
        return this.data;
    }

    public int size() {
        return size;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }

    public void clear() {
        data = (elements[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int indexOf(elements e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(elements e) {
        for (elements x : data) {
            if (e.equals(x)) {
                return true;
            }
        }
        return false;
    }
}