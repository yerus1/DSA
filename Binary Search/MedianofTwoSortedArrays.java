// Leetcode->https://leetcode.com/problems/median-of-two-sorted-arrays/description/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int x=nums1.length;
        int y=nums2.length;
        int low=0;
        int high=x;
        int part=(x+y+1)/2;
        while(low<=high){
            int partx=(low+high)/2;
            int party=part-partx;
            
            int maxLeftX=(partx==0) ? Integer.MIN_VALUE : nums1[partx-1];
            int minRightX=(partx==x) ? Integer.MAX_VALUE : nums1[partx];
            int maxLeftY=(party==0) ? Integer.MIN_VALUE : nums2[party-1];
            int minRightY=(party==y) ? Integer.MAX_VALUE : nums2[party];
            
            if(maxLeftX<=minRightY && maxLeftY<=minRightX){
                if((x+y)%2==0){
                    return ((double) Math.max(maxLeftX,maxLeftY)+Math.min(minRightX,minRightY))/2;
                }else{
                    return ((double) Math.max(maxLeftX,maxLeftY));
                }
            }else if(maxLeftX>minRightY){
                high=partx-1;
            }else{
                low=partx+1;
            }
        }
        return 0;
}
}