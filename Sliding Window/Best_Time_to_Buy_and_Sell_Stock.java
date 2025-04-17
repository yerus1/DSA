import java.util.*;

class Solution {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int sell : prices) {
            minPrice = Math.min(minPrice, sell);
            maxProfit = Math.max(maxProfit, sell - minPrice);
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int result1 = sol.maxProfit(prices1);
        System.out.println("Maximum Profit for prices [7,1,5,3,6,4]: " + result1);

        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        int result2 = sol.maxProfit(prices2);
        System.out.println("Maximum Profit for prices [7,6,4,3,1]: " + result2);

        // Example 3 - Custom input
        int[] prices3 = {2, 4, 1};
        int result3 = sol.maxProfit(prices3);
        System.out.println("Maximum Profit for prices [2,4,1]: " + result3);
    }
}
