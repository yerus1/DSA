package TwoPointer;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int in = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[in++] = nums[i];
            }
        }
        return in;
    }

    public static void main(String[] args) {
        int[] num = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(num, val));
    }
}
