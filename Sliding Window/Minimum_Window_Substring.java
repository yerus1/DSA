// Leetcode ->https://leetcode.com/problems/minimum-window-substring/description/

import java.util.*;
class Main {
    public static void main(String[] args) {
       String s = "ADOBECODEBANC", t = "ABC";
       HashMap<Character,Integer> map=new HashMap<>();
       for(char c:t.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
       }
       int right=0,left=0,minLen=Integer.MAX_VALUE;
       int count=map.size(),start=0;
       while(right<s.length()){
           char c=s.charAt(right);
           if(map.containsKey(c)){
               map.put(c,map.get(c)-1);
               if(map.get(c)==0){
                   count--;
               }
           }
           right++;
           while(count==0){
               if(right-left<minLen){
                   minLen=right-left;
                   start=left;
               }
              char ch=s.charAt(left);
              if(map.containsKey(ch)){
                  map.put(ch,map.get(ch)+1);
                  if(map.get(ch)>0){
                  count++;
                  }
              }
              left++;
           }
       }
       System.out.println(s.substring(start,start+minLen));
    }
}