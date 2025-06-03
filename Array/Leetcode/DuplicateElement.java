package Array;

import java.util.HashSet;

public class DuplicateElement {

    public static boolean duplicateElement(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(duplicateElement(arr));
    }
}
