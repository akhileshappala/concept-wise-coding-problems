
link : https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/861453848/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int left = 0;
        int right =0;
        int ans =0;
        for(right=0;right < s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
                set.add(s.charAt(right));
                ans = Math.max(ans,right-left+1);
            
        }
        System.out.println(s.substring(left,right));
        return ans;
    }
}
