class Solution {
    public int missingNumber(int[] nums) {
        int end = nums.length;
        int sum =0;
        int total =0;
            sum = (end*(end+1))/2;
        
        for(int i=0;i<nums.length;i++){
            total = total + nums[i];
        }
        int miss = sum - total ;
        return miss;
    }
}
