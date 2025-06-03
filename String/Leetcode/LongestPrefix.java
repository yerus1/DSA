package String.Leetcode;

import java.util.Arrays;

public class LongestPrefix {

    public static String longestPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder str = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length - 1];
        int n = Math.min(first.length(), last.length());
        for (int i = 0; i < n; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return str.toString();
            }
            str.append(first.charAt(i));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"dog", "racecar", "car"};
        System.out.println(longestPrefix(strs));
    }
}
