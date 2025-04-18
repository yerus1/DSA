// Leetcode-> https://leetcode.com/problems/koko-eating-bananas/description/

class Solution {
    private boolean kokoEats(int piles[],int h, int mid){
        int sum=0;
        for(int pile:piles){
            sum=sum+(int)Math.ceil((double)pile/mid);
        }
        return sum<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Integer.MIN_VALUE;
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        while(left<right){
            int mid=left+((right-left)/2);
            if(kokoEats(piles,h,mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}