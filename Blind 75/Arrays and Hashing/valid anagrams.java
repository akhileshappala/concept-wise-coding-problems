https://leetcode.com/problems/valid-anagram/submissions/


// 1. check length
// 2. sort and compare each string
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        else{
            char s1[] = s.toCharArray();
            char t1[] = t.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(t1);
            for(int i = 0;i < s.length();){
                if(s1[i] == t1[i]){
                    i++;
                }
                else {
                return false;
                }
            }
            
        }
        return true;
        
    }
}
