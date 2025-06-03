package TwoPointer.Leetcode;

import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = {3, 2, 2, 3};
        int val = 3;
        int len = removeElement(num, val);
        System.out.println(len);
        Arrays.stream(num).limit(len).forEach(System.out::print);
    }
}
