// for clear understanding of kadanes 
//give a test case -- [2,3,-1,0,2,9]
//and traverse throught the below algorithm  we will get a clear understanding of kadanes 
//and below approach


class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length ==0 || nums == null){
            return 0;
            
        }
        int max = nums[0], min = nums[0], result =nums[0];
        
        for(int i =1;i<nums.length;i++){
            int temp = max;
            max = Math.max(Math.max(nums[i]* max, nums[i]*min), nums[i]);
            min = Math.min(Math.min(nums[i]* temp, nums[i]*min), nums[i]);
            if(max>result){
                result = max;
            }
        }
        return result;
    }
}
