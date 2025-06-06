package Array.Basics;

import java.util.Arrays;

public class RotateArray {

    static void rotateArray(int[] arr, int k) {
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(nums, k);
        Arrays.stream(nums).forEach(System.out::print);
    }
}
