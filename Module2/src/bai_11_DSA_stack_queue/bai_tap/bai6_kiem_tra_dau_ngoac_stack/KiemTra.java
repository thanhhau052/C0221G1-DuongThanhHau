package bai_11_DSA_stack_queue.bai_tap.bai6_kiem_tra_dau_ngoac_stack;
import java.util.Stack;

public class KiemTra {
    public static void main(String[] args) {
        String[] strings = "s * (s – a) * (s – b) * (s – c)".split("");
        Stack bStack = new Stack() ;//chỉ để lưu dấu ()

        for (String iteam : strings){
            if (iteam.equals("(")){
                bStack.push(iteam);
            }else if (iteam.equals(")")){
                if (bStack.isEmpty()){
                    System.out.println(false);
                    return;
                }
                bStack.pop();// nếu không rổng xóa ngoặc trái
            }
        }//kiểm tra kết thúc bStrack
        if (bStack.isEmpty()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }


}
