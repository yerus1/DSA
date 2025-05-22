package Array;

public class RemoveDuplicate {
    public static int removeDuplicate(int[] nums) {
        int in = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[in] != nums[i]) {
                nums[++in] = nums[i];
            }
        }
        return in + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicate(nums));
    }
}
