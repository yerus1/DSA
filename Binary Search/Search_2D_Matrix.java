// Leetcode-> https://leetcode.com/problems/search-a-2d-matrix/description/

class Solution {
    private int findRow(int matrix[][],int target){
        int left =0;
        int right =matrix.length-1;
        while(left<=right){
            int mid=left+((right-left)/2);
            if(matrix[mid][0]<= target && target<=matrix[mid][matrix[0].length-1]){
                return mid;
            }else if(matrix[mid][0]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    private boolean binarySearch(int row,int matrix[][],int target){
        int left=0;
        int right=matrix[row].length-1;
        while(left<=right){
            int mid=left+((right-left)/2);
            if(matrix[row][mid]==target){
                return true;
            }else if(matrix[row][mid]>target){
                right=mid-1;
            }else{
                 left=mid+1;
            }
        }
        return false;

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=findRow(matrix, target);
        if(row!=-1){
        return binarySearch(row,matrix, target);
        }else{
            return false;
        }
    }
}