package bai_8_clean_code_refactoring.thuc_hanh;

public class FizzBuzz {
    class FizzBuzzTest {

        void testFizz3() {
            int number = 3;
            String expected = "Fizz";

            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }

        private void assertEquals(String expected, String result) {
        }


        void testFizz6() {
            int number = 6;
            String expected = "Fizz";

            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }


        void testBuzz5() {
            int number = 5;
            String expected = "Buzz";

            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }


        void testBuzz10() {
            int number = 10;
            String expected = "Buzz";

            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }


        void testFizzBuzz15() {
            int number = 15;
            String expected = "FizzBuzz";

            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }


        void testFizzBuzz30() {
            int number = 30;
            String expected = "FizzBuzz";

            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }
    }

    private static String fizzBuzz(int number) {
        return "zxc";
    }
}
