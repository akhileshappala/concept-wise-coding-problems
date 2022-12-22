
link : https://leetcode.com/problems/reverse-bits/description/

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int result =0;
        int pos = Integer.SIZE-1; // 31
    //    for (int i=0;i<=pos;i++){
    //            result<<=1;
    //            result = result + (n&1);
    //            n>>=1; // n = n/2;
               
    //        }


        for(int i =0;i < 32;i++){
            //taking the last bit using right shift and anding with 1 to get the value
            int lastBit = (n>>i)&1;
            //taking that lastbit lets say if its 30 0's-00000000000001,  then move that 1 in that to left by 31-i positions and do || with result.
            result = result | lastBit << (31-i);
        }
         return result;
       }
       
    }
