// Leetcode ->https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, (right - left) + 1);
            right++;
        }

        return max;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String input = "abcabcbb"; // Example input
        int result = sol.lengthOfLongestSubstring(input);
        
        System.out.println("Length of Longest Substring Without Repeating Characters: " + result);
    }
}
