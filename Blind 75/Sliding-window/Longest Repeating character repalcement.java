// link  : https://leetcode.com/problems/longest-repeating-character-replacement/description/


class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left =0;
        int maxf = 0;
        int ans = 0;
        for(int right = 0;right < s.length();right++){
            arr[s.charAt(right) - 'A']++;
            maxf = Math.max(maxf,  arr[s.charAt(right) - 'A'] );
            if((right-left+1) - maxf > k){
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
        
    }

    }
