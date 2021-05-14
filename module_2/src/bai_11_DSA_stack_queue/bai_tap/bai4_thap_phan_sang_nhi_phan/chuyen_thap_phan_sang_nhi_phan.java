package bai_11_DSA_stack_queue.bai_tap.bai4_thap_phan_sang_nhi_phan;

public class chuyen_thap_phan_sang_nhi_phan {
    public static String thapPhanSangNhiPhan(int n){
        String hienThi="";
        while (n>0){
            if (n%2==0){
                hienThi+=0;
                n=n/2;
            }else {
                hienThi+=1;
                n=(n-1)/2;

            }

        }
        return hienThi;

    }

}
