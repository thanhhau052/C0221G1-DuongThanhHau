public class test {

    public static int sum_even_numbers() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int x = 1; x < 8; x++) {
            System.out.println(x);
        }
    }
}

