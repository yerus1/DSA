package Recursion.Arrays;

public class CheckSort {

    static boolean checkSort(int[] arr) {
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int length) {
        if (length == arr.length - 1) return true;

        return (arr[length] < arr[length + 1] && helper(arr, length + 1));

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(checkSort(arr));
    }
}
