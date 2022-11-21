https://leetcode.com/problems/two-sum/submissions/


class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] results = new int[2];
        
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])) {
                results[0] = i;
                results[1]= map.get(target-nums[i]);
            }
            else{
                map.put(nums[i],i);
            }
            
        }
        return results;
         
}
}
