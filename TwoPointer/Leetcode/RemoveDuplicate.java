package TwoPointer.Leetcode;

import java.util.Arrays;

public class RemoveDuplicate {

    public static int removeDuplicate(int[] nums) {
        int count = 0;  //first pointer
        for (int i = 1; i < nums.length; i++) {  //second pointer
            if (nums[count] != nums[i]) {
                nums[++count] = nums[i];
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = removeDuplicate(nums);
        System.out.println(len);
        Arrays.stream(nums).limit(len).forEach(System.out::print);
    }
}
