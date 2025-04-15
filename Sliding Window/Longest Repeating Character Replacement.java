// Leetcode -> https://leetcode.com/problems/longest-repeating-character-replacement/description/

import java.util.*;
class Main {
    public static void main(String[] args) {
        String s="AABABBA";
        int k = 1;
        int freq[]=new int[26];
        int left =0;
        int maxFreq=0;
        int maxWin=0;
        
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++; 
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);  
            
            int winLen=right-left+1; 

            
            if(winLen-maxFreq>k){     
                freq[s.charAt(left)-'A']--;
                left++;
            }
            
            winLen=right-left+1;
            maxWin=Math.max(maxWin,winLen);
        }
        System.out.println(maxWin);
    }
}