
https://leetcode.com/problems/number-of-1-bits/description/


public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
     int total = 0;
        while(n!=0){
                // total = total + (n&1);
                // n=n>>>1;
            total ++;
            n &= (n - 1);
        }
        return total;
    }
}
