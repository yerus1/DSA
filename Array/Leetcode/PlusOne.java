package Array;

import java.util.Arrays;

public class PlusOne {

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 9, 9};
        Arrays.stream(plusOne(digits)).forEach(System.out::println);
    }
}
