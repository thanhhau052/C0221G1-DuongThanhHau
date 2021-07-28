public class TT {
    String[] tt(String string) {
        String[] arr = string.split("");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length - i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
        }
        return null;
    }
}
