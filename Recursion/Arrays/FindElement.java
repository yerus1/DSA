package Recursion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindElement {

    static int findElement(int[] arr, int target) {
        return helper(arr, target, 0);
    }

    static int helper(int[] arr, int target, int n) {
        if (n == arr.length) return -1;
        if (arr[n] == target) return n;
        return helper(arr, target, n + 1);
    }

    static List<Integer> findElement(int[] arr, int target, int index, List<Integer> list) {
        if (index == arr.length) return list;
        if (arr[index] == target) list.add(index);
        return findElement(arr, target, index + 1, list);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 18, 20, 18};
        int target = 18;
        System.out.println(findElement(arr, target));
        System.out.println(findElement(arr, target, 0, new ArrayList<>()));
    }
}
