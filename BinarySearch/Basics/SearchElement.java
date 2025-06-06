package BinarySearch.Basics;

public class SearchElement {

    static int searchElement(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }

    static int helper(int[] nums, int target, int left, int right) {
        int mid = left + ((right - left) / 2);
        if (nums[mid] == target) return mid;

        if (nums[left] <= nums[mid]) {
            if (nums[left] <= target && target > nums[mid]) {
                return helper(nums, target, left, mid-1);
            } else {
                return helper(nums, target, mid+1, right);
            }
        } else {
            if (nums[right] >= target && nums[mid] < target) {
                return helper(nums, target, mid+1, right);
            } else {
                return helper(nums, target, left, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 0, 1, 2, 3, 4};
        int target = 0;
        System.out.println(searchElement(nums, target)+1);
    }
}
