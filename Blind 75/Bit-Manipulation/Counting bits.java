https://leetcode.com/problems/counting-bits/


class Solution {
    public int[] countBits(int n) {
        int[]  total =  new int[n+1]; 
        total[0]=0;
        for(int i =1;i<=n;i++){
           
                total[i] = total[i>>1] + (i&1);
              
        }
        return total;
    }
}
