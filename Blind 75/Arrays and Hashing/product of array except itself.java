
https://leetcode.com/problems/product-of-array-except-self/submissions/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result  = new int[nums.length];
        
        //calculates the left multiplication
       int  leftValue =1;
        for(int i = 0;i< nums.length;i++){
            result[i] = leftValue; //initially it will be 1,untill the right multiplication is done.
            leftValue = leftValue * nums[i]; // leftvalue will keep on multiplying and assiging to result 
        }
        //Calculates the right multiplication 
       int  rightValue = 1;
        for(int i =nums.length-1;i>=0;i--){
            result[i]= result[i] * rightValue; // as result is already there with leftmultiplied values 
            rightValue = rightValue * nums[i]; 
        }
        return result;
        
       // Easy approach - if 0's are not allowed other wise there will be a case 0/0
        
        // int[] result = new int[nums.length];
        // int totalValue = 1;
        // for(int i=0;i<nums.length;i++){
        //      totalValue = totalValue * nums[i];
        // }
        // for(int i =0;i< nums.length;i++){
        //     result[i] = totalValue / nums[i];
        // }
        // return result;
    }
}
