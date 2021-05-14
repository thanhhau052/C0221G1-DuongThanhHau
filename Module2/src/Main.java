import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char mang[]="QWERTYUIOPLKJHGFDSAZXCVBNM".toCharArray();
        System.out.println("nhap vao chuoi : ");
        String nhap=scanner.nextLine();
        int dem=0;
        char mangNhap[] =nhap.toCharArray();
        for (int i=0 ; i<mangNhap.length; i++){
            for (int j=0; j<mang.length; j++){
                if (mangNhap[i]==mang[j]){
                    dem++;
                }
            }

        }
        System.out.println(dem);
        char a='a';
        char b= 'A';
        System.out.println(a==b);

    }
}
