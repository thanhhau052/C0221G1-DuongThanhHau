package bai2_vong_lap.thuc_hanh;

public class testFor {
    public static void main(String[] args) {
        int i = 1;
        while(i < 5){
            if(i % 3 == 0){
                i++;
                continue;
            }
            System.out.println("Hello");
            i++;
        }
    }
}

