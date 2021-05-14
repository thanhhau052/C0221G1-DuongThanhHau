package bai_11_DSA_stack_queue.bai_tap.bai1_dao_nguoc_chuoi_stack;

public  class MainDaoChuoi {
    public static void reverse(StringBuffer str) {
        int n =  str.length();
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
        String ch = "uaHaLneTiot";
        StringBuffer chuoiKq = new StringBuffer(ch);
        reverse(chuoiKq);
        System.out.println();
        System.out.println(ch + " đảo ngược là : " + chuoiKq);

    }
}