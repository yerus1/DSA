package Recursion.Arrays;

public class FindElement {

    static int findElement(int[] arr, int target) {
        return helper(arr, target, 0);
    }

    static int helper(int[] arr, int target, int n) {
        if (n == arr.length) return -1;
        if (arr[n] == target) return n;
        return helper(arr, target, n + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 18, 20, 21};
        int target = 18;
        System.out.println(findElement(arr, target));
    }
}
