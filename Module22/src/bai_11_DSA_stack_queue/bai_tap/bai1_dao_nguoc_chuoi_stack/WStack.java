package bai_11_DSA_stack_queue.bai_tap.bai1_dao_nguoc_chuoi_stack;


public class WStack {
    int size;
    int top;
    char[] chuoi;

    public WStack(int size, int top, char[] chuoi) {
        this.size = size;
        this.top = top;
        this.chuoi = chuoi;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    WStack(int n) {
        top = -1;
        size = n;
        chuoi = new char[size];
    }


    boolean push(char x) {
        if (top >= size) {
            System.out.println(" trên stack ! ");
            return false;
        } else {
            chuoi[++top] = x;
            return true;
        }
    }

    char pop() {
        if (top < 0) {
            System.out.println("Dưới Stack");
            return 0;
        } else {
            char x = chuoi[top--];
            return x;
        }
    }


}



