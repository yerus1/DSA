// Leetcode -> https://leetcode.com/problems/permutation-in-string/description/

import java.util.*;
class Permutation_String {
    public static boolean checkInclusion(String s1, String s2) {
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;

            if (i >= s1.length()) {
                freq2[s2.charAt(i - s1.length()) - 'a']--;
            }

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
}