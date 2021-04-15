package bai_12_java_collection_framwork.bai_tap.testt;

import java.util.Arrays;

class ArraySorting {

    public static void main(String... moeTavern) {
        int[] moesPints = new int[] {9, 8, 7, 6, 1};

        Arrays.sort(moesPints);

        Arrays.stream(moesPints).forEach(System.out::print);

        Simpson[] simpsons = new Simpson[]{new Simpson(), new Simpson()};

        Arrays.sort(simpsons);
        Arrays.stream(simpsons).forEach(System.out::println);
    }
}