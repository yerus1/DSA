package Array;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            int sum=target-nums[j];
            if(map.containsKey(sum)){
                System.out.println(j+""+map.get(sum));
            }
        }
    }
}
